package com.example.jimbobspethospital.Owner;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long owner_id;

    private String email;
    private String name;
    private String address;


    public Owner(String email, String name, String address) {
        this.email = email;
        this.name = name;
        this.address = address;
    }

    public Owner() {}

}

