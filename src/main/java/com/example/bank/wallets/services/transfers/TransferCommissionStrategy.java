package com.example.bank.wallets.services.transfers;

import com.example.bank.wallets.models.WalletTransfer;

public abstract class TransferCommissionStrategy {
    public abstract double calculate(WalletTransfer transfer);

    protected boolean isTransferInternal(WalletTransfer transfer) {
        return transfer.getSender().getOwner().getId() == transfer.getConsumer().getOwner().getId();
    }
}
