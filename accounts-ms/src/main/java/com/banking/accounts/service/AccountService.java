package com.banking.accounts.service;

import com.banking.accounts.model.Accounts;
import com.banking.accounts.model.Customer;
import com.banking.accounts.respository.AccountsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AccountService {

    @Autowired
    AccountsRespository accountsRespository;

    public Accounts giveAccountDetails(@RequestBody Customer customer) {
        Accounts accounts = accountsRespository.findByCustomerId(customer.getCustomerId());
        if(accounts != null)
            return accounts;
        return null;
    }
}
