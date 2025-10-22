package com.example.jimbobspethospital.Staff;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long staff_id;

    private String name;
    private String position;
    private String email;

    // @JoinColumn(name = "treatment_id")
    private Long treatment_id;

    public Staff(String name, String position, String email, Long treatment_id) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.treatment_id = treatment_id;
    }
}

