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

    private String pet_name;
    private String pet_type;
    private String age;

    public pet(long pet_id, long owner_id, String pet_name, String pet_type, String age) {
        this.pet_id = pet_id;
        this.owner_id = owner_id;
        this.pet_name = pet_name;
        this.pet_type = pet_type;
        this.age = age;
    }

    public pet() {

    }

    public String getPet_name() {
        return pet_name;
    }

    public void setPet_name(String pet_name) {
        this.pet_name = pet_name;
    }

    public String getPet_type() {
        return pet_type;
    }

    public void setPet_type(String pet_type) {
        this.pet_type = pet_type;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
