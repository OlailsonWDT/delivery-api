package com.herokuapp.delivery.repository;

import com.herokuapp.delivery.domain.CommandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandRepositoryEntity extends JpaRepository<CommandEntity, Long> {
}
