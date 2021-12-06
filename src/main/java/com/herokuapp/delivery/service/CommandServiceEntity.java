package com.herokuapp.delivery.service;

import com.herokuapp.delivery.domain.CommandEntity;
import com.herokuapp.delivery.request.CommandRequest;
import com.herokuapp.delivery.response.CommandResponse;

import java.util.List;
import java.util.Optional;

public interface CommandServiceEntity {

    CommandResponse create(CommandRequest request);

    List<CommandEntity> findAll();

    Optional<CommandEntity> findById(Long id);
}
