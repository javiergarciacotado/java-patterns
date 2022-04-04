package com.owned.design.patterns.behavioral.command.example_1.domain;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class Trade {

    long id;
    int amount;
    BigDecimal price;


}
