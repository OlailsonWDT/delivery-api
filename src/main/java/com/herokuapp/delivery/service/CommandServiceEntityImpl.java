package com.herokuapp.delivery.service;

import com.herokuapp.delivery.domain.CommandEntity;
import com.herokuapp.delivery.exception.BadRequestException;
import com.herokuapp.delivery.mappers.CommandMapper;
import com.herokuapp.delivery.repository.CommandRepositoryEntity;
import com.herokuapp.delivery.request.CommandRequest;
import com.herokuapp.delivery.response.CommandResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommandServiceEntityImpl implements CommandServiceEntity {

    private final CommandMapper commandMapper;

    private final CommandRepositoryEntity commandRepository;

    public CommandServiceEntityImpl(CommandMapper commandMapper, CommandRepositoryEntity commandRepository) {
        this.commandMapper = commandMapper;
        this.commandRepository = commandRepository;
    }

    @Override
    public CommandResponse create(CommandRequest command) {
        CommandEntity commandEntity = commandMapper.fromRequestToEntity(command);
        commandRepository.save(commandEntity);
        return commandMapper.fromEntityToResponse(commandEntity);
    }

    @Override
    public List<CommandEntity> findAll() {
        return commandRepository.findAll();
    }

    @Override
    public Optional<CommandEntity> findById(Long id) {
        return Optional.ofNullable(commandRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Command Not Found!")));
    }
}
