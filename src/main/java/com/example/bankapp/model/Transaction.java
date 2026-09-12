package com.example.bankapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String description;

    private BigDecimal amountOfMoney;

    private LocalDateTime transactionDate;


    private String category;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;



}
