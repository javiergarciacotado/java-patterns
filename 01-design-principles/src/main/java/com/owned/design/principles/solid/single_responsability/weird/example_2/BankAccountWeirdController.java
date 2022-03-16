package com.owned.design.principles.solid.single_responsability.weird.example_2;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class BankAccountWeirdController {

    private final ListBankAccounts listBankAccounts;
    private final LoadBankAccount loadBankAccount;
    private final CreateBankAccountUseCase createBankAccountUseCase;

    @GetMapping("/accounts")
    public List<BankAccountDTO> list() {
        return Collections.emptyList();
    }

    @GetMapping("/accounts/{id}")
    public BankAccountDTO account(@PathVariable("id") String accountId) {
        return null;
    }

    @PostMapping("/accounts")
    public BankAccountDTO createAccount(@RequestBody BankAccountDTO bankAccountDTO) {
        return null;
    }

    /**
     * Can we add more features (responsabilities) to this class?
     */

}

interface LoadBankAccount {
    //Write some operations
}

interface ListBankAccounts {
    //Write some operations
}

interface CreateBankAccountUseCase {
    //Write some operations
}
