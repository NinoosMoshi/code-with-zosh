package com.ninos.service.order;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ninos.exception.OrderException;
import com.ninos.model.entity.Address;
import com.ninos.model.entity.Order;
import com.ninos.model.entity.User;
import com.ninos.repository.CartRepository;
import com.ninos.service.admin.product.ProductService;
import com.ninos.service.cartItem.CartItemService;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService{

    private final CartRepository cartRepository;
    private final CartItemService cartItemService;
    private final ProductService productService;


    @Override
    public Order createOrder(User user, Address shippingAddress) {
        return null;
    }

    @Override
    public Order findOrderById(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public List<Order> usersOrderHistory(Long userId) {
        return null;
    }

    @Override
    public Order placedOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public Order confirmedOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public Order shippedOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public Order deliveredOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public Order cancledOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public void deleteOrder(Long orderId) throws OrderException {

    }
}
