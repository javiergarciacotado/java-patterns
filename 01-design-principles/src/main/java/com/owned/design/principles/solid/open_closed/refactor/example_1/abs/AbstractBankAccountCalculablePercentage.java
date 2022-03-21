package com.owned.design.principles.solid.open_closed.refactor.example_1.abs;

import java.math.BigDecimal;

public abstract class AbstractBankAccountCalculablePercentage {

    abstract BigDecimal amount();
    abstract int years();
}
