package com.herokuapp.delivery.request;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class OrderRequest implements Serializable {

    private String orderStatus;
    private String orderType;
    private BigDecimal totalPrice;
}
