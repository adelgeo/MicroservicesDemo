package com.microservices.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class ClientController {

    @Autowired
    private ClientPersistance clientPersistance;

    public ClientController(ClientPersistance clientPersistance) {
        this.clientPersistance = clientPersistance;
    }

    @RequestMapping("findAll")
    public List<ClientModel> findAllClients() {
        return clientPersistance.findAll();
    }

    @RequestMapping("findById/{id}")
    public Optional<ClientModel> getById(@PathVariable("id") long id) {
        return clientPersistance.findById(id);
    }

    //find by first name
    @RequestMapping("findByName/{fnam}")
    public ClientModel getById(@PathVariable("fnam") String fnam) {
        return clientPersistance.findByFName(fnam);
    }
}
