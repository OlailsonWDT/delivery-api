package com.herokuapp.delivery.resource;

import com.herokuapp.delivery.domain.OrderEntity;
import com.herokuapp.delivery.request.OrderRequest;
import com.herokuapp.delivery.response.OrderResponse;
import com.herokuapp.delivery.service.OrderServiceEntityImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderResource {

    private final OrderServiceEntityImpl orderService;

    @PostMapping
    public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest order) {
        return new ResponseEntity<>(orderService.create(order), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<OrderEntity>> listOrders() {
        return ResponseEntity.ok(orderService.findAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<OrderEntity>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(orderService.findById(id));
    }
}
