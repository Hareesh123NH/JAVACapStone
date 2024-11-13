package com.JAVACapStone.Team1.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="users")
@Data
@FieldDefaults(level =  AccessLevel.PRIVATE)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(nullable = false)
    String name;

    String password;

    @Column(unique = true)
    String email;

    @Column(nullable = false,unique =true)
    String mobileNumber;


}
