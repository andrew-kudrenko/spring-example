package com.example.bank.wallets.services;

import com.example.bank.wallets.models.WalletTransfer;

public class WalletService {
    public void transfer(WalletTransfer transfer) throws Exception {
        if (transfer.getSender().equals(transfer.getConsumer())) {
            throw new Exception("[Wallet Transfer] cannot be the same.");
        }

        if (!this.enoughBalanceForTransfer(transfer)) {
            throw new Exception("[Wallet Transfer] Not enough money.");
        }

        transfer.getConsumer().updateBalance(transfer.getQuantity());
    }

    private boolean enoughBalanceForTransfer(WalletTransfer transfer) {
        return transfer.getSender().getBalance() >= transfer.getQuantity();
    }
}
