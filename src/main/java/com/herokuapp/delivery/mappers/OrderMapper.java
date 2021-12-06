package com.herokuapp.delivery.mappers;

import com.herokuapp.delivery.domain.OrderEntity;
import com.herokuapp.delivery.request.OrderRequest;
import com.herokuapp.delivery.response.OrderResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderEntity fromRequestToEntity(OrderRequest request);

    OrderResponse fromEntityToResponse(OrderEntity entity);
}
