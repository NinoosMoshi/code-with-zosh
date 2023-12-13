package com.ninos.service.rating;

import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ninos.exception.ProductException;
import com.ninos.model.dto.RatingRequest;
import com.ninos.model.entity.Product;
import com.ninos.model.entity.Rating;
import com.ninos.model.entity.User;
import com.ninos.repository.RatingRepository;
import com.ninos.service.admin.product.ProductService;

@RequiredArgsConstructor
@Service
public class RatingServiceImpl implements RatingService{

    private final RatingRepository ratingRepository;
    private final ProductService productService;

    @Override
    public Rating createRating(RatingRequest req, User user) throws ProductException {
        Product product = productService.findProductById(req.getProductId());
        Rating rating = new Rating();
        rating.setProduct(product);
        rating.setUser(user);
        rating.setRating(req.getRating());
        rating.setCreatedAt(LocalDateTime.now());
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getProductsRating(Long productId) {
        return ratingRepository.getAllProductsRating(productId);
    }
}
