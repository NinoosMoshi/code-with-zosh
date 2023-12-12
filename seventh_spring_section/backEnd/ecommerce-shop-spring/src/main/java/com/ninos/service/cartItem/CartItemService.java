package com.ninos.service.cartItem;

import com.ninos.exception.CartItemException;
import com.ninos.exception.UserException;
import com.ninos.model.entity.Cart;
import com.ninos.model.entity.CartItem;
import com.ninos.model.entity.Product;

public interface CartItemService {

    CartItem createCartItem(CartItem cartItem);

    CartItem updateCartItem(Long userId, Long id, CartItem cartItem) throws CartItemException, UserException;

    CartItem isCartItemExist(Cart cart, Product product, String size, Long userId);

    void removeCartItem(Long userId, Long cartItemId) throws CartItemException, UserException;

    CartItem findCartItemById(Long cartItemId) throws CartItemException;

}
