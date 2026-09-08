package com.example.bankapp.model;

import com.sun.istack.NotNull;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "bank_customers")
public class BankCustomers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String username;
    @NotNull
    private String password;
    @NotNull
    private String email;

    private Long accountNumber;
    private BigDecimal money;
}
