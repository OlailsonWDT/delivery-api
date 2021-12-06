package com.herokuapp.delivery.response;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class OrderResponse implements Serializable {

    private Long id;
    private String orderStatus;
    private String orderType;
    private BigDecimal totalPrice;
}
