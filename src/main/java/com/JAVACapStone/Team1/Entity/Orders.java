package com.JAVACapStone.Team1.Entity;

import com.JAVACapStone.Team1.Enums.DeliveryStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Entity
@Table(name = "orders")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(nullable = false)
    long timestamp;

    @Column(nullable = false)
    float totalAmountPaid;

    float deliveryCharge;      //do we need Float(wrapper class) as it can be null

    float amountSaved;        //do we need Float(wrapper class) as it can be null

    @Column(nullable = false)
    float orderedLocationLatitude;

    @Column(nullable = false)
    float orderedLocationLongitude;

    @Column(nullable = false)
    String contactNumber;

    @Enumerated(EnumType.STRING)
    DeliveryStatus deliveryStatus;

    @ManyToOne
    @JoinColumn
    User user;

    @ManyToOne
    @JoinColumn
    AddressBook addressBook;






}
