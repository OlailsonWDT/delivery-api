package com.herokuapp.delivery.service;

import com.herokuapp.delivery.domain.ItemOrderEntity;
import com.herokuapp.delivery.exception.BadRequestException;
import com.herokuapp.delivery.mappers.ItemOrderMapper;
import com.herokuapp.delivery.repository.ItemOrderRepositoryEntity;
import com.herokuapp.delivery.request.ItemOrderRequest;
import com.herokuapp.delivery.response.ItemOrderResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemOrderServiceEntityImpl implements ItemOrderServiceEntity {

    private final ItemOrderMapper itemOrderMapper;

    private final ItemOrderRepositoryEntity itemOrderRepository;


    public ItemOrderServiceEntityImpl(ItemOrderMapper itemOrderMapper, ItemOrderRepositoryEntity itemOrderRepository) {
        this.itemOrderMapper = itemOrderMapper;
        this.itemOrderRepository = itemOrderRepository;
    }

    @Override
    public ItemOrderResponse create(ItemOrderRequest itemOrder) {
        return null;
    }

    @Override
    public List<ItemOrderEntity> findAll() {
        return itemOrderRepository.findAll();
    }

    @Override
    public Optional<ItemOrderEntity> findById(Long id) {
        return Optional.ofNullable(itemOrderRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Item Order Not Found!")));
    }
}
