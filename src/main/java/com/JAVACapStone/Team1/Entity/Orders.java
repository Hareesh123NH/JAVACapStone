package com.JAVACapStone.Team1.Entity;

import com.JAVACapStone.Team1.Enums.DeliveryStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.List;

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

    long timestamp;
    float totalAmountPaid;
    float deliveryCharge;
    float amountSaved;
    float orderedLocationLatitute;
    float orderedLocationLongitude;
    String contactNumber;
    @Enumerated(EnumType.STRING)
    DeliveryStatus deliveryStatus;

    @OneToMany
    List<OrderItem> orderItemList;





}
