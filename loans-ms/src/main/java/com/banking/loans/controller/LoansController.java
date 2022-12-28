package com.banking.loans.controller;

import com.banking.loans.model.Customer;
import com.banking.loans.model.Loans;
import com.banking.loans.service.LoansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoansController {

    @Autowired
    private LoansService loansService;

    @GetMapping("/myLoans")
    public List<Loans> getLoanDetails(@RequestBody Customer customer) {
        return loansService.giveLoanDetails(customer);
    }
}
