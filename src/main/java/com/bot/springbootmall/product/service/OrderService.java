package com.bot.springbootmall.product.service;

import com.bot.springbootmall.product.dto.CreateOrderRequest;
import com.bot.springbootmall.product.dto.OrderQueryParams;
import com.bot.springbootmall.product.model.Members;
import com.bot.springbootmall.product.model.Order;

import java.util.List;

public interface OrderService {

//    void isUserExist(Integer memNo);

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer memno, CreateOrderRequest createOrderRequest);

    Members getMemberDetailsById(Integer memno);

}

