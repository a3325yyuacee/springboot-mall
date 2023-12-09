package com.bot.springbootmall.product.service;

import com.bot.springbootmall.product.dto.CreateOrderRequest;
import com.bot.springbootmall.product.dto.OrderQueryParams;
import com.bot.springbootmall.product.model.Order;

import java.util.List;

public interface OrderService {
    Order getOrderById(Integer orderId);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrder(OrderQueryParams orderQueryParams);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}