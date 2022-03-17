package com.owned.design.principles.solid.open_closed.refactor.example_1;

import java.math.BigDecimal;

//TODO: Try to implement the same behavior using abstract class
public interface BankAccountPercentageCalculable {

    int getPercentage(BigDecimal amount, int years);


}
