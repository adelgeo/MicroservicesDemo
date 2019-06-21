package com.microservices.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientPersistance extends JpaRepository<ClientModel, Long>{

    ClientModel findByFName(String id);

}
