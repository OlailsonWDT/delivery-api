package com.herokuapp.delivery.service;

import com.herokuapp.delivery.domain.ProductEntity;
import com.herokuapp.delivery.exception.BadRequestException;
import com.herokuapp.delivery.mappers.ProductMapper;
import com.herokuapp.delivery.repository.ProductRepositoryEntity;
import com.herokuapp.delivery.request.ProductRequest;
import com.herokuapp.delivery.response.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceEntityImpl implements ProductServiceEntity {

    private final ProductMapper productMapper;

    private final ProductRepositoryEntity productRepository;

    public ProductServiceEntityImpl(ProductMapper productMapper, ProductRepositoryEntity productRepository) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }

    @Override
    public ProductResponse create(ProductRequest product) {
        ProductEntity productEntity = productMapper.fromRequestToEntity(product);
        productRepository.save(productEntity);
        return productMapper.fromEntityToResponse(productEntity);
    }

    @Override
    public List<ProductEntity> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<ProductEntity> findById(Long id) {
        return Optional.ofNullable(productRepository.findById(id).orElseThrow(() -> new BadRequestException("Product Not Found!")));
    }
}

