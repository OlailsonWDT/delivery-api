package com.herokuapp.delivery.request;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ItemOrderRequest implements Serializable {

    private Long productId;
    private Long orderId;
    private Integer qtyItem;
    private BigDecimal subTotalPrice;
}
