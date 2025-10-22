package com.example.jimbobspethospital.Owner;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id")
    private Long owner_id;

    private String email;
    private String name;
    private String address;


    public Owner(String email, String name, String address) {
        this.email = email;
        this.name = name;
        this.address = address;
    }
    }

