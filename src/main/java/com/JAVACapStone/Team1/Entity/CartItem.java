package com.JAVACapStone.Team1.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "cart_item")
public class CartItem {

//    Table CartItem {
//
//        product_id int
//
//        quantity int
//
//        user_id int
//
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Integer quantity;


}
