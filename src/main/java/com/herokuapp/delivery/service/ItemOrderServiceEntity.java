package com.herokuapp.delivery.service;

import com.herokuapp.delivery.domain.ItemOrderEntity;
import com.herokuapp.delivery.request.ItemOrderRequest;
import com.herokuapp.delivery.response.ItemOrderResponse;

import java.util.List;
import java.util.Optional;

public interface ItemOrderServiceEntity {

    ItemOrderResponse create(ItemOrderRequest itemOrder);

    List<ItemOrderEntity> findAll();

    Optional<ItemOrderEntity> findById(Long id);
}
