package com.ninos.service.admin.product;

import java.util.List;

import org.springframework.data.domain.Page;

import com.ninos.exception.ProductException;
import com.ninos.model.dto.CreateProductRequest;
import com.ninos.model.entity.Product;

public interface ProductService {

    Product createProduct(CreateProductRequest req);

    String deleteProduct(Long productId) throws ProductException;

    Product updateProduct(Long productId, Product req) throws ProductException;

    Product findProductById(Long productId) throws ProductException;

    List<Product> findProductByCategory(String category);

    Page<Product> getAllProduct(String category, List<String> colors, List<String> sizes,
                                Integer minPrice,
                                Integer maxPrice,
                                Integer minDiscount,
                                String sort, String stock, Integer pageNumber, Integer pageSize);


}
