package com.bot.springbootmall.product.controller;

import com.bot.springbootmall.product.dto.CreateOrderRequest;
import com.bot.springbootmall.product.dto.OrderQueryParams;
import com.bot.springbootmall.product.model.Order;
import com.bot.springbootmall.product.service.OrderService;
import com.bot.springbootmall.product.util.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@Validated
@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/users/{userId}/orders")
    public ResponseEntity<Page<Order>> getOrders(@PathVariable Integer userId,
                                                 @RequestParam(defaultValue = "10") @Max(1000) @Min(0) Integer limit,
                                                 @RequestParam(defaultValue = "0") @Min(0) Integer offset) {

        OrderQueryParams orderQueryParams = new OrderQueryParams(userId, limit, offset);
        List<Order> orderList = orderService.getOrders(orderQueryParams);

        Integer count = orderService.countOrder(orderQueryParams);

        Page<Order> page = Page.<Order>builder()
                .limit(limit)
                .offset(offset)
                .total(count)
                .results(orderList)
                .build();

        return ResponseEntity.status(HttpStatus.OK).body(page);
    }


    @PostMapping("/users/{userId}/orders")
    public ResponseEntity<?> createOrder(@PathVariable Integer userId,
                                         @RequestBody @Valid CreateOrderRequest createOrderRequest) {
        Integer orderId = orderService.createOrder(userId, createOrderRequest);

        Order order = orderService.getOrderById(orderId);

        return ResponseEntity.status(HttpStatus.CREATED).body(order);
    }
}
