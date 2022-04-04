

package com.owned.design.patterns.behavioral.visitor.example_1;

import lombok.Data;

import java.math.BigDecimal;

/**
 * The base domain class that makes up part of a Trade in our class hierarchy/object graph.
 *
 * Does not form part of Visitor pattern per se.
 */
@Data
public abstract class AbstractTradePart {

    private BigDecimal price;
    private String currency;
}
