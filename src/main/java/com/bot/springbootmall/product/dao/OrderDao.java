package com.bot.springbootmall.product.dao;

import com.bot.springbootmall.product.dto.CreateOrderRequest;
import com.bot.springbootmall.product.dto.OrderQueryParams;
import com.bot.springbootmall.product.model.Order;
import com.bot.springbootmall.product.model.OrderItem;

import java.util.List;

public interface OrderDao {
    Order getOrderById(Integer orderId);

    List<Order> getOrders(OrderQueryParams userId);

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<OrderItem> geOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}