package com.herokuapp.delivery.response;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ItemOrderResponse implements Serializable {

    private Long id;
    private Long productId;
    private Long orderId;
    private Integer qtyItem;
    private BigDecimal subTotalPrice;
}
