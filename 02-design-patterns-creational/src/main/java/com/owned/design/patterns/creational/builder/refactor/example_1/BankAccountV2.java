package com.owned.design.patterns.creational.builder.refactor.example_1;

import lombok.Builder;

import java.math.BigDecimal;
import java.util.Date;

@Builder(setterPrefix = "with")
public class BankAccountV2 {

    private String id;
    private String name;
    private Date dateOpened;
    private Date dateClosed;
    private String customerId;
    private BigDecimal currentBalance;
    private String otherAccountDetails;
}
