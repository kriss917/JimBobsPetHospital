package com.example.jimbobspethospital.Pets;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pet_id;
    private long owner_id;

    public pet(long pet_id, long owner_id, String name, int age, String type) {
        this.pet_id = pet_id;
        this.owner_id = owner_id;
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public pet() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String name;
    private int age;
    private String type;




}
