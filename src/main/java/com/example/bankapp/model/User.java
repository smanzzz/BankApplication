package com.example.bankapp.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false, unique = true)
    private String email;

    //creating a bidirectional relationship with account with the cascade part of the code.
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Account> accountList;





/*
MappedBy signals hibernate that the key for the relationship is on the other side.

This means that although you link 2 tables together,
only 1 of those tables has a foreign key constraint to the other one.
MappedBy allows you to still link from the table not containing the constraint to the other table.
----------------------------------------------------------------------------------------------------------
The Order entity (owning side) will have the @ManyToOne annotation with a @JoinColumn pointing to customer_id.
The Customer entity (inverse side) will have the @OneToMany annotation with the mappedBy attribute,
indicating that the mapping is controlled by the Order entity.

 */


}
