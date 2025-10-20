package com.example.jimbobspethospital.Pets;

import com.example.jimbobspethospital.Owner.Owner;
import jakarta.persistence.*;

@Entity
public class pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pet_id;

    @ManyToOne
    @JoinColumn(name = "owner_id")
     private Owner owner_id;

    private String pet_name;
    private String pet_type;
    private String age;

    public pet(Owner owner_id, String pet_name, String pet_type, String age) {
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
