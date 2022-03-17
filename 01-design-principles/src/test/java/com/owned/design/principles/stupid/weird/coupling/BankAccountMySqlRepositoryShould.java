package com.owned.design.principles.stupid.weird.coupling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Nice!! Being able to inject behavior by constructor
 * Even better if the injection uses an interface (dependency inversion principle by soliD)
 */
class BankAccountMySqlRepositoryShould {

    private BankAccountMySqlRepository bankAccountMySqlRepository;

    @Mock
    private EntityManager entityManager;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        this.bankAccountMySqlRepository = new BankAccountMySqlRepository(entityManager);
    }

    @Test
    void whatever_test() {
        assertThat(1).isEqualTo(1);
    }
}