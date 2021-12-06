package com.herokuapp.delivery.service;

import java.math.BigDecimal;

public interface ProcessOrder {
    void calculateOrder(BigDecimal value);
}
