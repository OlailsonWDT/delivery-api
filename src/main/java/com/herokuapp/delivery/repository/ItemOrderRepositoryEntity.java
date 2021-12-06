package com.herokuapp.delivery.repository;

import com.herokuapp.delivery.domain.ItemOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemOrderRepositoryEntity extends JpaRepository<ItemOrderEntity, Long> {
}
