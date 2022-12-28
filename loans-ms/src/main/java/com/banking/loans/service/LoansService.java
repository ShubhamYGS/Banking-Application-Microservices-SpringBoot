package com.banking.loans.service;

import com.banking.loans.model.Customer;
import com.banking.loans.model.Loans;
import com.banking.loans.repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoansService {


    @Autowired
    private LoansRepository loansRepository;

    public List<Loans> giveLoanDetails(Customer customer) {
        List<Loans> loans = loansRepository.findByCustomerIdOrderByStartDateDesc(customer.getCustomerId());
        if(loans != null)
            return loans;
        return null;
    }
}
