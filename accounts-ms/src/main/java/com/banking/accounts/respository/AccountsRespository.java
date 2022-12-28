package com.banking.accounts.respository;

import com.banking.accounts.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRespository extends JpaRepository<Accounts, Long> {

    Accounts findByCustomerId(int customerId);
}
