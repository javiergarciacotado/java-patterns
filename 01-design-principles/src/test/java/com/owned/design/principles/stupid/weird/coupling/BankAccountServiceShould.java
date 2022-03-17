package com.owned.design.principles.stupid.weird.coupling;

import org.junit.jupiter.api.BeforeEach;

class BankAccountServiceShould {

    private BankAccountService bankAccountService;

    @BeforeEach
    void setUp() {
        /**
         * Do you see the problem?
         * 💡 Tip: Try to use a test double inside the test
         */
        bankAccountService = new BankAccountService();

    }
}