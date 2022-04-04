

package com.owned.design.patterns.behavioral.visitor.example_1;

import java.math.BigDecimal;

/**
 * A Futures trade domain object.
 *
 */
public class FuturesTrade extends AbstractTrade {

    public FuturesTrade(String currency, BigDecimal amount) {
        super(currency, amount);
    }
}
