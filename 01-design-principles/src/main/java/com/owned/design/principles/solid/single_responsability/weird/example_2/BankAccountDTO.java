package com.owned.design.principles.solid.single_responsability.weird.example_2;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
public class BankAccountDTO {

    private final String id;
    private final String name;
    private final BigDecimal money;

}
