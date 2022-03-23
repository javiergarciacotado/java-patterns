package com.owned.design.patterns.structural.adapter;

import java.math.BigDecimal;

/**
 * A bank account
 */
interface BankAccount {

    BigDecimal balance();

    boolean overdraftAvailable();

}
