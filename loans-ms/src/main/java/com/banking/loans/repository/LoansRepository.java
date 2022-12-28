package com.banking.loans.repository;

import com.banking.loans.model.Loans;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoansRepository extends JpaRepository<Loans, Integer> {
    List<Loans> findByCustomerIdOrderByStartDateDesc(int customerId);
}
