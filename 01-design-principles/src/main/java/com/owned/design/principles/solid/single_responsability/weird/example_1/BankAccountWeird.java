package com.owned.design.principles.solid.single_responsability.weird.example_1;

import java.math.BigDecimal;

/**
 * What do you think?
 * Tip: it's really a domain entity?
 * @see com.owned.design.principles.solid.single_responsability.weird.example_2.BankAccountDTO
 */
public class BankAccountWeird {

    private final String id;
    private final String name;
    private final BigDecimal money;

    public BankAccountWeird(String id, String name, BigDecimal money) {
        this.id = id;
        this.name = name;
        this.money = money;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void printStatus() {
        System.out.println("BankAccountV1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}');
    }
}

class BankAccountWeirdApplication {

    public static void main(String[] args) {
        BankAccountWeird bankAccountWeird = new BankAccountWeird("", "", BigDecimal.ONE);
        bankAccountWeird.printStatus();
    }
}
