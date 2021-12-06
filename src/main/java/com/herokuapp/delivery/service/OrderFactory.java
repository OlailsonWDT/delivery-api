package com.herokuapp.delivery.service;

import com.herokuapp.delivery.domain.enums.OrderTypeEntity;

public class OrderFactory {

    public static ProcessOrder getOrderStrategy(OrderTypeEntity orderType) {
        switch (orderType) {
            case LOCAL:
                return new OrderLocal();
            case DELIVERY:
                return new OrderDelivery();
            default:
                return null;
        }
    }
}
