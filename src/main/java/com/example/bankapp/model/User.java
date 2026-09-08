package com.example.bankapp.model;

import com.sun.istack.NotNull;
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
    private String username;
    @NotNull
    private String password;
    @NotNull
    private String email;

    @OneToMany(mappedBy = "account")
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
