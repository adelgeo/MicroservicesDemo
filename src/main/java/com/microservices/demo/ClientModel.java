package com.microservices.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fName;
    private String lName;
    public ClientModel(String fName, String lName) {
        super();
        this.fName = fName;
        this.lName = lName;
    }
    public ClientModel() {
        super();
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public Long getId() {
        return id;
    }






}

