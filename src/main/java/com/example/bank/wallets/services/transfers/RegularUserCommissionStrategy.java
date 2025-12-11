package com.example.bank.wallets.services.transfers;

import com.example.bank.wallets.models.WalletTransfer;

public class RegularUserCommissionStrategy extends TransferCommissionStrategy {
    @Override
    public double calculate(WalletTransfer transfer) {
        if (isTransferInternal(transfer)) {
            return 0.02;
        }

        return 0.05;
    }
}
