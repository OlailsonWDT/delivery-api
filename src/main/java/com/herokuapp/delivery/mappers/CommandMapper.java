package com.herokuapp.delivery.mappers;

import com.herokuapp.delivery.domain.CommandEntity;
import com.herokuapp.delivery.request.CommandRequest;
import com.herokuapp.delivery.response.CommandResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CommandMapper {

    CommandMapper INSTANCE = Mappers.getMapper(CommandMapper.class);

    CommandEntity fromRequestToEntity(CommandRequest request);

    CommandResponse fromEntityToResponse(CommandEntity entity);
}
