package com.herokuapp.delivery.service;

import com.herokuapp.delivery.domain.ProductEntity;
import com.herokuapp.delivery.request.ProductRequest;
import com.herokuapp.delivery.response.ProductResponse;

import java.util.List;
import java.util.Optional;

public interface ProductServiceEntity {

    ProductResponse create(ProductRequest product);

    List<ProductEntity> findAll();

    Optional<ProductEntity> findById(Long id);
}
