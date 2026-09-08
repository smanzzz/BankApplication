package com.example.bankapp.model;

import com.sun.istack.NotNull;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Entity
@Getter
@Setter
@Table(name="account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String accountName;

    private BigDecimal money;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Long userId;




}
