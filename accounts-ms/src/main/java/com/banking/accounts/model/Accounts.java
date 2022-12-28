package com.banking.accounts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter @Setter @ToString
@Entity
public class Accounts {
    private int customerId;

    @Id
    private long accountNumber;

    private String accountType;

    private String branchAddress;

    private LocalDate  createDate;
}
