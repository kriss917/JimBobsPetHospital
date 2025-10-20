package com.example.jimbobspethospital.Pets;

import com.example.jimbobspethospital.Owner.Owner;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
}
