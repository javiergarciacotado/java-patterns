package com.owned.design.principles.solid.open_closed.refactor.example_1;

import com.owned.design.principles.solid.open_closed.refactor.example_1.abs.AbstractBankAccountCalculablePercentage;
import com.owned.design.principles.solid.open_closed.refactor.example_1.abs.CalculablePercentage;
import com.owned.design.principles.solid.open_closed.refactor.example_1.abs.MortgageBankAccountPercentage;
import com.owned.design.principles.solid.open_closed.refactor.example_1.iface.BankAccountPercentageCalculable;
import com.owned.design.principles.solid.open_closed.refactor.example_1.iface.MortgageBankAccount;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class BankAccountManagementApplication {

    public static void main(String[] args) {
        /**
         * Using interfaces
         */
         final BankAccountPercentageCalculable bankAccountPercentageCalculable = new MortgageBankAccount(BigDecimal.valueOf(10_000), 25);
         log.info("[using interface] Percentage is {}", bankAccountPercentageCalculable.getPercentage());
        /**
         * @see com.owned.design.principles.solid.open_closed.refactor.example_1.iface.PensionPlanBankAccount getPercentage
         * @see com.owned.design.principles.solid.open_closed.refactor.example_1.iface.MortgageBankAccount getPercentage
         *
         * we can do it better!
         */
        final AbstractBankAccountCalculablePercentage abstractBankAccountCalculablePercentage = new MortgageBankAccountPercentage(BigDecimal.valueOf(10_000), 25);
        log.info("[using abstract class] Percentage is {}", new CalculablePercentage().calculate(abstractBankAccountCalculablePercentage));
        /**
         * Can we obtain same behavior using interfaces? (yes)
         */

    }
}
