package com.example.bank.wallets.services;

import com.example.bank.wallets.models.Wallet;
import com.example.bank.wallets.models.WalletTransfer;
import com.example.bank.wallets.repositories.WalletTransfersRepository;
import com.example.bank.wallets.repositories.WalletsRepository;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletService {
    @Autowired
    private WalletsRepository walletsRepository;

    @Autowired
    private WalletTransfersRepository walletTransfersRepository;

    public List<Wallet> getUserWallets(int userId) {
        return walletsRepository.findAllByOwnerId(userId);
    }

    public List<WalletTransfer> getTransfersBySenderUuid(String senderUuid) {
        return walletTransfersRepository.findAllBySenderUuid(senderUuid);
    }

    public WalletTransfer transfer(WalletTransfer transfer) throws Exception {
        var quantity = transfer.getQuantity();

        if (quantity <= 0) {
            throw new BadRequestException("Некорректная сумма операции.");
        }

        var sender = walletsRepository.findOneByUuid(transfer.getSender().getUuid());
        var consumer = walletsRepository.findOneByUuid(transfer.getConsumer().getUuid());

        transfer.setSender(sender);
        transfer.setConsumer(consumer);

        if (sender.getUuid().equals(consumer.getUuid())) {
            throw new BadRequestException("UUID счёта-отправителя и счёта-получателя должны отличаться.");
        }

        if (sender.getBalance() < quantity) {
            throw new BadRequestException("Недостаточно средств (" + quantity + ") на счету (" + transfer.getSender().getBalance() + ")");
        }

        consumer.updateBalance(quantity);
        sender.updateBalance(-quantity);

        return walletTransfersRepository.save(transfer);
    }
}
