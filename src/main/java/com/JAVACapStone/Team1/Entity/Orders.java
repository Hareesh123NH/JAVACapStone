package com.JAVACapStone.Team1.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "orders")

public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
//    Table Orders {
//
//        order_id int [primary key]
//
//        timestamp long // epoch time
//
//        delivery_status enum
//
//        address_id int
//
//        user_id int
//
//        total_amount_paid float
//
//        delivery_charge float
//
//        amount_saved float
//
//        ordered_location_lat float
//
//        ordered_location_lng float
//
//        contact_number string
//
//    }
    @CreationTimestamp
    long timeStamp;

}
