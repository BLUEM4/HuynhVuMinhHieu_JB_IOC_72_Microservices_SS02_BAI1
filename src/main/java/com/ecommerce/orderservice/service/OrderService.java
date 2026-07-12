package com.ecommerce.orderservice.service;

import com.ecommerce.orderservice.dto.request.OrderCreateRequest;
import com.ecommerce.orderservice.dto.response.OrderResponse;

import java.util.List;


public interface OrderService {

    OrderResponse createOrder(OrderCreateRequest request);

    OrderResponse getOrderById(Long id);

    List<OrderResponse> getAllOrders();

    void cancelOrder(Long id);
}
