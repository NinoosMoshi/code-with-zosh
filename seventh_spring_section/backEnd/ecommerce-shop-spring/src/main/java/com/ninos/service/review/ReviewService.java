package com.ninos.service.review;

import java.util.List;

import com.ninos.exception.ProductException;
import com.ninos.model.dto.ReviewRequest;
import com.ninos.model.entity.Review;
import com.ninos.model.entity.User;

public interface ReviewService {

    Review createReview(ReviewRequest req, User user) throws ProductException;
    List<Review> getAllReview(Long productId);

}
