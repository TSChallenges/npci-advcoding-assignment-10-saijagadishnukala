package com.mystore.orders.controller;

import com.mystore.orders.dto.OrderRequest;
import com.mystore.orders.dto.OrderResponse;
import com.mystore.orders.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@RefreshScope
public class OrderController {


    @Autowired
    private OrderService orderService;

    @PostMapping("/placeOrder")
    public OrderResponse placeOrder(@RequestBody OrderRequest orderRequest){

        return orderService.placeOrder(orderRequest);
    }

}