package com.owned.design.patterns.structural.adapter;

import com.owned.design.patterns.structural.adapter.third_party.ExternalBankAccount;

import java.math.BigDecimal;

/**
 * Use case: AS A bank owner, imagine you want to integrate external bank accounts ....
 */
public class ExternalBankAccountAdapter extends AbstractBankAccount {

    private final ExternalBankAccount externalBankAccount;

    public ExternalBankAccountAdapter(ExternalBankAccount externalBankAccount) {
        super(externalBankAccount.getBalance(), externalBankAccount.isNegativeBalance());
        this.externalBankAccount = externalBankAccount;
    }

    /**
     * <p>
     * For the external account, we have to deduct the tax owed for that country
     * </p>
     */
    @Override
    public BigDecimal balance() {
        final BigDecimal currentBalance = super.balance();
        final BigDecimal balanceWithExternalTaxes = currentBalance.multiply(externalBankAccount.getTaxRate());
        return currentBalance.subtract(balanceWithExternalTaxes);
    }
}
