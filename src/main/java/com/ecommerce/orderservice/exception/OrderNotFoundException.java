package com.ecommerce.orderservice.exception;


public class OrderNotFoundException extends RuntimeException {

    public OrderNotFoundException(Long orderId) {
        super("Không tìm thấy đơn hàng với id: " + orderId);
    }

    public OrderNotFoundException(String message) {
        super(message);
    }
}
