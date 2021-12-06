package com.herokuapp.delivery.resource;

import com.herokuapp.delivery.domain.ProductEntity;
import com.herokuapp.delivery.request.ProductRequest;
import com.herokuapp.delivery.response.ProductResponse;
import com.herokuapp.delivery.service.ProductServiceEntityImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductResource {

    private final ProductServiceEntityImpl productService;

    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest product) {
        return new ResponseEntity<>(productService.create(product), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProductEntity>> listProducts() {
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<ProductEntity>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.findById(id));
    }
}
