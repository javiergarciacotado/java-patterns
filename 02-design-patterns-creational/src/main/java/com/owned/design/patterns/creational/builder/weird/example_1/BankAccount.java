package com.owned.design.patterns.creational.builder.weird.example_1;

import java.math.BigDecimal;
import java.util.Date;

final class BankAccount {

    private String id;
    private String name;
    private Date dateOpened;
    private Date dateClosed;
    private String customerId;
    private BigDecimal currentBalance;
    private String otherAccountDetails;

    /**
     * Refactor
     */
    public BankAccount(String id, String name, Date dateOpened, Date dateClosed, String customerId, BigDecimal currentBalance, String otherAccountDetails) {
        this.id = id;
        this.name = name;
        this.dateOpened = dateOpened;
        this.dateClosed = dateClosed;
        this.customerId = customerId;
        this.currentBalance = currentBalance;
        this.otherAccountDetails = otherAccountDetails;
    }




}
