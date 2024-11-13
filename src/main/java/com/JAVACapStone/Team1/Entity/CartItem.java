package com.JAVACapStone.Team1.Entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "cart_item")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    Integer quantity; //if quantity goes below 0, we will delete right. then do we need wrapper cls here

    @ManyToOne
    @JoinColumn
    User user;

//    @ManyToOne
//    @JoinColumn
//    Product product
}
