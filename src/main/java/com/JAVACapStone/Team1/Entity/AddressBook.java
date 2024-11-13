package com.JAVACapStone.Team1.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "address_book")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AddressBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int addressId;
    float latitute;
    float longitude;
    @Column(nullable = false)
    String addressLine1;
    String addressLine2;
    String addressLine3;


}
