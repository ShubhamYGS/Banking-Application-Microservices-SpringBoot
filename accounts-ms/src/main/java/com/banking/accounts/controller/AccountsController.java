package com.banking.accounts.controller;

import com.banking.accounts.model.Accounts;
import com.banking.accounts.model.Customer;
import com.banking.accounts.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/myAccount")
    public Accounts getAccountDetails(@RequestBody Customer customer) {
        return accountService.giveAccountDetails(customer);
    }

}
