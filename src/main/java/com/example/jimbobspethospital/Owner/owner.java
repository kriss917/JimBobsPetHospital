package com.example.jimbobspethospital.Owner;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

@Entity
public class owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long owner_id;

    private String email;
    private String name;
    private String address;


    public owner(String email, String name, String address) {
        this.email = email;
        this.name = name;
        this.address = address;
    }

    public owner() {}

    public Long getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Long owner_id) {
        this.owner_id = owner_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
