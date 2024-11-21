package com.CapStone.blinkitservice.product;


import com.CapStone.blinkitservice.brand.BrandEntity;
import com.CapStone.blinkitservice.subcategory.SubCategoryEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class ProductEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;

    @Column(nullable = false)
    String name;

    String description;
    String unit;

    @Column(nullable = false)
    String image_url;
    Integer max_order_limit;

    @Column(nullable = false)
    Double price;

    Double discount;
    boolean isAvailable;
    String ingredients;
    String packaging_type;
    String key_features;

    @ManyToOne
    @JoinColumn(name = "sub_category_id", nullable = false)
    SubCategoryEntity subCategory;

    @ManyToOne
    @JoinColumn(name = "brand_id", nullable = false)
    BrandEntity brand;
}
