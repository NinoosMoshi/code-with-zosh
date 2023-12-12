package com.ninos.service.cart;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import com.ninos.exception.ProductException;
import com.ninos.model.dto.AddItemRequest;
import com.ninos.model.entity.Cart;
import com.ninos.model.entity.CartItem;
import com.ninos.model.entity.Product;
import com.ninos.model.entity.User;
import com.ninos.repository.CartItemRepository;
import com.ninos.repository.CartRepository;
import com.ninos.service.admin.product.ProductService;
import com.ninos.service.cartItem.CartItemService;

@RequiredArgsConstructor
@Service
public class CartServiceImpl implements CartService{

    private final CartRepository cartRepository;
    private final CartItemService cartItemService;
    private ProductService productService;


    @Override
    public Cart createCart(User user) {
        Cart cart = new Cart();
        cart.setUser(user);
        return cartRepository.save(cart);
    }

    @Override
    public String addCartItem(Long userId, AddItemRequest req) throws ProductException {
        Cart cart = cartRepository.findByUserId(userId);
        Product product = productService.findProductById(req.getProductId());

        CartItem isPresent = cartItemService.isCartItemExist(cart,product, req.getSize(), userId);

        if(isPresent == null){
            CartItem cartItem = new CartItem();
            cartItem.setProduct(product);
            cartItem.setCart(cart);
            cartItem.setQuantity(req.getQuantity());
            cartItem.setUserId(userId);

            int price = req.getQuantity() * product.getDiscountedPrice();
            cartItem.setPrice(price);
            cartItem.setSize(req.getSize());

            CartItem createdCartItem = cartItemService.createCartItem(cartItem);
            cart.getCartItems().add(createdCartItem);
        }
        return "item add to cart";
    }



    @Override
    public Cart findUserCart(Long userId) {
        Cart cart = cartRepository.findByUserId(userId);

        int totalPrice=0;
        int totalDiscountedPrice=0;
        int totalItem=0;

        for(CartItem cartItem: cart.getCartItems()){
           totalPrice = totalPrice + cartItem.getPrice();
           totalDiscountedPrice = totalDiscountedPrice + cartItem.getDiscountedPrice();
           totalItem = totalItem + cartItem.getQuantity();
        }

        cart.setTotalDiscountedPrice(totalDiscountedPrice);
        cart.setTotalItem(totalItem);
        cart.setTotalPrice(totalPrice);
        cart.setDiscount(totalPrice - totalDiscountedPrice);

        return cartRepository.save(cart);
    }
}
