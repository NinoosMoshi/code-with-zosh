package com.ninos.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

import com.ninos.model.entity.Size;

@Getter
@Setter
public class CreateProductRequest {

    private String title;
    private String description;
    private int price;
    private int discountedPrice;
    private int discountPersent;
    private int quantity;
    private String brand;
    private String color;

    private Set<Size> size = new HashSet<>();

    private String imageUrl;

    // men/clothing/mens_shirt     men-> topLevel  clothing-> secondLevel  mens_shirt-> thirdLevel
    private String topLevelCategory;
    private String secondLevelCategory;
    private String thirdLevelCategory;


}
