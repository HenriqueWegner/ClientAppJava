package io.github.HenriqueWegner.ClientsApp.rest;

import io.github.HenriqueWegner.ClientsApp.model.entity.Client;
import io.github.HenriqueWegner.ClientsApp.model.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientRepository repository;

    @Autowired
    public ClientController(ClientRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client save(@RequestBody Client client){
        return repository.save(client);
    }

    @GetMapping("{id}")
    public Client findById(@PathVariable Integer id){
        return repository
                .findById(id)
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND) );
    }

}
