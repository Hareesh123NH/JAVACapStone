package com.JAVACapStone.Team1.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "order_item")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderItem {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    long id;

    @Column(nullable = false)
    int quantity;

    @Column(nullable = false)
    float amountPaid;

    float discount;       //do we need Float(wrapper class) as it can be null

    @ManyToOne
    @JoinColumn
    Orders orders;

    //@ManyToOne
    //@JoinColumn
    //Product product
}
