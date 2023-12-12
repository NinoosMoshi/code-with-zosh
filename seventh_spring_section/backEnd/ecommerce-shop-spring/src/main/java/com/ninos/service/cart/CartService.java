package com.ninos.service.cart;

import com.ninos.exception.ProductException;
import com.ninos.model.dto.AddItemRequest;
import com.ninos.model.entity.Cart;
import com.ninos.model.entity.User;

public interface CartService {

    Cart createCart(User user);

    String addCartItem(Long userId, AddItemRequest req) throws ProductException;

    Cart findUserCart(Long userId);


}
