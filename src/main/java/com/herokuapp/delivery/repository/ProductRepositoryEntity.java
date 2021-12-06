package com.herokuapp.delivery.repository;

import com.herokuapp.delivery.domain.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositoryEntity extends JpaRepository<ProductEntity, Long> {
}
