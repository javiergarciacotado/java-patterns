package com.owned.design.patterns.structural.decorator.example_1;

import java.math.BigDecimal;

/**
 * A bank account
 */
interface BankAccount {

    BigDecimal balance();

    boolean overdraftAvailable();

    void debit(BigDecimal debit);

    void credit(BigDecimal credit);


}
