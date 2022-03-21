package com.owned.design.principles.solid.single_responsability.refactor.example_2;

import com.owned.design.principles.solid.single_responsability.weird.example_2.BankAccountDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequiredArgsConstructor
final class BankAccountListAccountsController {

    private final ListBankAccounts listBankAccounts;

    @GetMapping("/accounts")
    public List<BankAccountDTO> list() {
        return Collections.emptyList();
    }
}

interface ListBankAccounts {}
