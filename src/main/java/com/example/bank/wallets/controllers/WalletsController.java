package com.example.bank.wallets.controllers;

import com.example.bank.wallets.models.Wallet;
import com.example.bank.wallets.models.WalletTransfer;
import com.example.bank.wallets.services.WalletService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WalletsController {
    @Autowired
    private WalletService walletService;

    @GetMapping("/wallets/users")
    public List<Wallet> getUserWallets(@RequestParam int userId) throws Exception {
        if (userId == 0) {
            throw new BadRequestException("Некорректный ID пользователя");
        }

        return walletService.getUserWallets(userId);
    }

    @GetMapping("/transfers")
    public List<WalletTransfer> getUserTransfers(
            @RequestParam String senderUuid
    ) throws Exception {
        if (senderUuid.isBlank()) {
            throw new BadRequestException("Некорректный UUID отправителя");
        }

        return walletService.getTransfersBySenderUuid(senderUuid);
    }

    @PostMapping("/transfers")
    public WalletTransfer getUserTransfers(@RequestBody WalletTransfer body) throws Exception {
        return walletService.transfer(body);
    }
}
