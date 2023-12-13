package com.ninos.service.rating;

import java.util.List;

import com.ninos.exception.ProductException;
import com.ninos.model.dto.RatingRequest;
import com.ninos.model.entity.Rating;
import com.ninos.model.entity.User;

public interface RatingService {

    Rating createRating(RatingRequest req, User user) throws ProductException;

    List<Rating> getProductsRating(Long productId);

}
