package com.herokuapp.delivery.resource;

import com.herokuapp.delivery.domain.CommandEntity;
import com.herokuapp.delivery.request.CommandRequest;
import com.herokuapp.delivery.response.CommandResponse;
import com.herokuapp.delivery.service.CommandServiceEntityImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/command")
@RequiredArgsConstructor
public class CommandResource {

    private final CommandServiceEntityImpl commandService;

    @PostMapping
    public ResponseEntity<CommandResponse> createCommand(@RequestBody CommandRequest command) {
        return new ResponseEntity<>(commandService.create(command), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<CommandEntity>> listCommands() {
        return ResponseEntity.ok(commandService.findAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<CommandEntity>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(commandService.findById(id));
    }
}
