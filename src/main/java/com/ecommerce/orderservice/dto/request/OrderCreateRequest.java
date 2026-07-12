package com.ecommerce.orderservice.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderCreateRequest {

    @NotNull(message = "customerId không được để trống")
    private Long customerId;

    @NotNull(message = "totalAmount không được để trống")
    @Positive(message = "totalAmount phải lớn hơn 0")
    private BigDecimal totalAmount;
}
