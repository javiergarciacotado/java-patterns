package com.owned.design.principles.stupid.weird.coupling;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * What's wrong?? or it's not 👎? Try to demonstrate it
 * 💡 Tip: Test to the rescue!
 */

public class BankAccountService {

    private final EntityManager entityManager = Persistence.createEntityManagerFactory("com.owned.design.patterns").createEntityManager();
    private final BankAccountMySqlRepository bankAccountMySqlRepository = new BankAccountMySqlRepository(entityManager);

    //intentionally omit
}

class BankAccountMySqlRepository {

    private final EntityManager entityManager;

    BankAccountMySqlRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
