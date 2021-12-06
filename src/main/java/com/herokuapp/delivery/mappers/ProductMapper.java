package com.herokuapp.delivery.mappers;

import com.herokuapp.delivery.domain.ProductEntity;
import com.herokuapp.delivery.request.ProductRequest;
import com.herokuapp.delivery.response.ProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductEntity fromRequestToEntity(ProductRequest request);

    ProductResponse fromEntityToResponse(ProductEntity entity);
}
