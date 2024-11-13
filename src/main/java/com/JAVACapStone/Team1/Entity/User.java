package com.JAVACapStone.Team1.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    private String password;

    @Column(unique = true)
    private String email;

    @Column(nullable = false,unique =true)
    private String mobileNumber;



}
