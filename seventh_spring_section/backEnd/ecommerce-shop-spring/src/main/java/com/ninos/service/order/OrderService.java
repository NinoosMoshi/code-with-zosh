package com.ninos.service.order;

import java.util.List;

import com.ninos.exception.OrderException;
import com.ninos.model.entity.Address;
import com.ninos.model.entity.Order;
import com.ninos.model.entity.User;

public interface OrderService {

   Order createOrder(User user, Address shippingAddress);

   Order findOrderById(Long orderId) throws OrderException;

   List<Order> usersOrderHistory(Long userId);

   Order placedOrder(Long orderId) throws OrderException;

   Order confirmedOrder(Long orderId) throws OrderException;

   Order shippedOrder(Long orderId) throws OrderException;

   Order deliveredOrder(Long orderId) throws OrderException;

   Order cancledOrder(Long orderId) throws OrderException;

   List<Order> getAllOrders();

   void deleteOrder(Long orderId) throws OrderException;




}
