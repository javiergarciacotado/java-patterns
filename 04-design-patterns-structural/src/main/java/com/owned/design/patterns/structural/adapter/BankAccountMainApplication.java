package com.owned.design.patterns.structural.adapter;

import com.owned.design.patterns.structural.adapter.third_party.ExternalBankAccount;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public final class BankAccountMainApplication {

    public static void main(String[] args) {
        final BankAccount localPlatinumBankAccount = new LocalPlatinumBankAccount(BigDecimal.TEN);
        log.info("[local] Balance {} ", localPlatinumBankAccount.balance());
        final ExternalBankAccount externalBankAccount = new ExternalBankAccount(BigDecimal.TEN, false, BigDecimal.ZERO);
        final ExternalBankAccountAdapter externalBankAccountAdapter = new ExternalBankAccountAdapter(externalBankAccount);
        log.info("[external] Balance {}", externalBankAccountAdapter.balance());
    }
}
