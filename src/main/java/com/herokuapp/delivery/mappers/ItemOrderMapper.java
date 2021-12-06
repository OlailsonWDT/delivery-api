package com.herokuapp.delivery.mappers;

import com.herokuapp.delivery.domain.ItemOrderEntity;
import com.herokuapp.delivery.request.ItemOrderRequest;
import com.herokuapp.delivery.response.ItemOrderResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ItemOrderMapper {

    ItemOrderMapper INSTANCE = Mappers.getMapper(ItemOrderMapper.class);

    ItemOrderEntity fromRequestToEntity(ItemOrderRequest request);

    ItemOrderResponse fromEntityToResponse(ItemOrderEntity entity);
}
