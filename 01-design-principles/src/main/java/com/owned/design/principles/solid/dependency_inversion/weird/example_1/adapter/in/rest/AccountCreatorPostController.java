package com.owned.design.principles.solid.dependency_inversion.weird.example_1.adapter.in.rest;

import com.owned.design.principles.solid.dependency_inversion.weird.example_1.application.AccountCreatorService;
import com.owned.design.principles.solid.dependency_inversion.weird.example_1.application.command.BankAccountCreatorCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;

@RestController
@RequiredArgsConstructor
public class AccountCreatorPostController {

    private final AccountCreatorService accountCreatorService; //out of scope

    @PostMapping("/account/{id}")
    public ResponseEntity<String> create(@PathVariable String id, @RequestBody InputStream inputStream) { //Maybe better to set InputStream

        //convert InputStream to BankAccountDTO

        //convert BankAccountDTO to BankAccountCommand
        accountCreatorService.create(new BankAccountCreatorCommand(id));

        return new ResponseEntity<>("whatever", HttpStatus.CREATED);

    }

}
