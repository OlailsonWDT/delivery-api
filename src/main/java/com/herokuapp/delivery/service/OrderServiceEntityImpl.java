package com.herokuapp.delivery.service;

import com.herokuapp.delivery.domain.OrderEntity;
import com.herokuapp.delivery.exception.BadRequestException;
import com.herokuapp.delivery.mappers.OrderMapper;
import com.herokuapp.delivery.repository.OrderRepositoryEntity;
import com.herokuapp.delivery.request.OrderRequest;
import com.herokuapp.delivery.response.OrderResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceEntityImpl implements OrderServiceEntity {

    private final OrderMapper orderMapper;

    private final OrderRepositoryEntity orderRepository;

    public OrderServiceEntityImpl(OrderMapper orderMapper, OrderRepositoryEntity orderRepository) {
        this.orderMapper = orderMapper;
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderResponse create(OrderRequest order) {
        OrderEntity orderEntity = orderMapper.fromRequestToEntity(order);
        orderRepository.save(orderEntity);
        return orderMapper.fromEntityToResponse(orderEntity);
    }

    @Override
    public List<OrderEntity> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<OrderEntity> findById(Long id) {
        return Optional.ofNullable(orderRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Order Not Found!")));
    }
}
