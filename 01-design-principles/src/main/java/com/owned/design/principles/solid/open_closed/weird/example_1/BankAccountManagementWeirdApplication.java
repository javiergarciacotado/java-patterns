package com.owned.design.principles.solid.open_closed.weird.example_1;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class BankAccountManagementWeirdApplication {

    public static void main(String[] args) {
        final MortgageWeirdBankAccount mortgageWeirdBankAccount = new MortgageWeirdBankAccount(BigDecimal.valueOf(100000), 25);
        log.info("Percentage " + mortgageWeirdBankAccount.calculatePendingPercentage());
        final PensionPlanWeirdBankAccount pensionPlanWeirdBankAccount = new PensionPlanWeirdBankAccount(BigDecimal.valueOf(5000), 25);
        log.info("Percentage " + pensionPlanWeirdBankAccount.calculateBenefitsPercentage());

        /**
         * Can we do it better?
         */
    }
}
