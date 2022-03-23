package com.owned.design.patterns.creational.abstract_factory.weird.example_1;


import com.owned.design.patterns.creational.abstract_factory.weird.example_1.address.Address;
import com.owned.design.patterns.creational.abstract_factory.weird.example_1.bank_account.BankAccount;
import com.owned.design.patterns.creational.abstract_factory.weird.example_1.bank_product.BankProduct;

/**
 * This is the Abstract Factory class providing operations that all concrete factory classes must
 * override and implement to build stuff.
 *
 * Even it's a correct implementation of the Abstract factory pattern ....
 * Can you spot the issue???
 */
public abstract class AbstractBankOperation {

  /**
   * Creates an Address object.
   *
   * @return the Address.
   */
  public abstract Address createAddress();

  /**
   * Creates an Account object.
   *
   * @return the BankAccount.
   */
  public abstract BankAccount createBankAccount();

  /**
   * Creates a Product object.
   *
   * @return the Product.
   */
  public abstract BankProduct createProduct();

}
