package com.owned.design.principles.solid.open_closed.weird.example_1;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public final class BankAccountManagementWeirdApplication {

    public static void main(String[] args) {
        /**
         * Can we do it better?
         */
        final MortgageWeirdBankAccount mortgageWeirdBankAccount = new MortgageWeirdBankAccount(BigDecimal.valueOf(10_0000), 25);
        log.info("Percentage is {}", mortgageWeirdBankAccount.calculatePendingPercentage());
        final PensionPlanWeirdBankAccount pensionPlanWeirdBankAccount = new PensionPlanWeirdBankAccount(BigDecimal.valueOf(10_0000), 25);
        log.info("Percentage is {}", pensionPlanWeirdBankAccount.calculateBenefitsPercentage());
    }
}
