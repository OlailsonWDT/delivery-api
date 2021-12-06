package com.herokuapp.delivery.repository;

import com.herokuapp.delivery.domain.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepositoryEntity extends JpaRepository<OrderEntity, Long> {
}
