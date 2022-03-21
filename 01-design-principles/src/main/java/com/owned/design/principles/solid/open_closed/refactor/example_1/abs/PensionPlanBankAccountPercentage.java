package com.owned.design.principles.solid.open_closed.refactor.example_1.abs;

import lombok.EqualsAndHashCode;
import lombok.Value;

import java.math.BigDecimal;

@Value
@EqualsAndHashCode(callSuper = true)
public class PensionPlanBankAccountPercentage extends AbstractBankAccountCalculablePercentage {

    BigDecimal amount;
    int years;

    public PensionPlanBankAccountPercentage(BigDecimal amount, int years) {
        this.amount = amount;
        this.years = years;
    }

    @Override
    BigDecimal amount() {
        return amount;
    }

    @Override
    int years() {
        return years;
    }
}
