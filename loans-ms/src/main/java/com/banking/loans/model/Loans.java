package com.banking.loans.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@Getter @Setter @ToString
@Entity
public class Loans {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int loanNumber;

    private int customerId;

    private Date startDate;

    private String loanType;

    private int totalLoan;

    private int amountPaid;

    private int outstandingAmount;

    private String createDate;
}
