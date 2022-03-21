package com.owned.design.principles.solid.open_closed.refactor.example_1.abs;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CalculablePercentage {

    public int calculate(AbstractBankAccountCalculablePercentage abstractBankAccountCalculablePercentage) {
        return abstractBankAccountCalculablePercentage.amount().intValue() * 100 / abstractBankAccountCalculablePercentage.years();
    }
}
