package com.owned.design.principles.solid.single_responsability.weird.example_3;

import com.owned.design.principles.solid.single_responsability.weird.example_2.BankAccountDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.math.BigDecimal;


/**
 * How about this one?
 */
@RestController
public class BankAccountAnotherWeirdController {

    private EntityManager entityManager;

    @PostMapping("/accounts")
    public BankAccountDTO createAccount(@RequestBody BankAccountDTO bankAccountDTO) { //Maybe better to set InputStream
        final String sql = "INSERT INTO account (id, name, money) VALUES (" + bankAccountDTO.getId() + ", " + bankAccountDTO.getName() + ", " + bankAccountDTO.getMoney() + ")";

        //execute query
        entityManager.getTransaction().begin();
        Query query = entityManager.createNativeQuery(sql);
        Object[] accounts = (Object[]) query.getSingleResult();

        return new BankAccountDTO("no-real-id", "no-real-name", BigDecimal.ZERO);
    }
}
