package com.ninos.model.dto;

import lombok.Data;

@Data
public class RatingRequest {

    private Long productId;
    private double rating;

}
