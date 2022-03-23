package com.owned.design.patterns.creational.builder.refactor.example_1;

import java.math.BigDecimal;
import java.util.Date;


final class BankAccountV1 {

    private final String id;
    private final String name;
    private final Date dateOpened;
    private final Date dateClosed;
    private final String customerId;
    private final BigDecimal currentBalance;
    private final String otherAccountDetails;

    /**
     * Not allowing to build instances from outside
     * @param bankAccountV1Builder instance containing the desired property values
     */
    private BankAccountV1(BankAccountV1Builder bankAccountV1Builder) {
        this.id = bankAccountV1Builder.id;
        this.name = bankAccountV1Builder.name;
        this.dateOpened = bankAccountV1Builder.dateOpened;
        this.dateClosed = bankAccountV1Builder.dateClosed;
        this.customerId = bankAccountV1Builder.customerId;
        this.currentBalance = bankAccountV1Builder.currentBalance;
        this.otherAccountDetails = bankAccountV1Builder.otherAccountDetails;
    }

    public static class BankAccountV1Builder {

        private String id;
        private String name;
        private Date dateOpened;
        private Date dateClosed;
        private String customerId;
        private BigDecimal currentBalance;
        private String otherAccountDetails;

        public static BankAccountV1Builder builder() {
            return new BankAccountV1Builder();
        }

        public BankAccountV1Builder withId(String id) {
            this.id = id;
            return this;
        }

        public BankAccountV1Builder withName(String name) {
            this.name = name;
            return this;
        }

        public BankAccountV1Builder withDateOpened(Date opened) {
            this.dateOpened = opened;
            return this;
        }

        //add rest of the fields...

        public BankAccountV1 build() {
            return new BankAccountV1(this);
        }
    }
}

