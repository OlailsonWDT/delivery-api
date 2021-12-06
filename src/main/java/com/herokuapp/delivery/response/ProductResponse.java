package com.herokuapp.delivery.response;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ProductResponse implements Serializable {

    private Long id;
    private String prdName;
    private BigDecimal prdPrice;
}
