package com.herokuapp.delivery.service;

import com.herokuapp.delivery.domain.OrderEntity;
import com.herokuapp.delivery.request.OrderRequest;
import com.herokuapp.delivery.response.OrderResponse;

import java.util.List;
import java.util.Optional;

public interface OrderServiceEntity {

    OrderResponse create(OrderRequest order);

    List<OrderEntity> findAll();

    Optional<OrderEntity> findById(Long id);
}
