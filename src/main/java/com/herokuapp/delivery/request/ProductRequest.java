package com.herokuapp.delivery.request;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ProductRequest implements Serializable {

    private String prdName;
    private BigDecimal prdPrice;
}
