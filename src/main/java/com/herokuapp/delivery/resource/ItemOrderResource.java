package com.herokuapp.delivery.resource;

import com.herokuapp.delivery.domain.ItemOrderEntity;
import com.herokuapp.delivery.request.ItemOrderRequest;
import com.herokuapp.delivery.response.ItemOrderResponse;
import com.herokuapp.delivery.service.ItemOrderServiceEntityImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/item-order")
@RequiredArgsConstructor
public class ItemOrderResource {

    private final ItemOrderServiceEntityImpl itemOrderService;

    @PostMapping
    public ResponseEntity<ItemOrderResponse> createItemOrder(@RequestBody ItemOrderRequest itemOrder) {
        return new ResponseEntity<>(itemOrderService.create(itemOrder), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ItemOrderEntity>> listItemOrder() {
        return ResponseEntity.ok(itemOrderService.findAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<ItemOrderEntity>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(itemOrderService.findById(id));
    }
}
