package com.example.jimbobspethospital.Treatment;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Treatment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long treatment_id;

    @Column(name = "treatment_type_id")
    private String treatment_type_id;

    @Column(name = "treatment_type")
    private String treatment_type;

    @Column(name = "treatment_cost")
    private Long treatment_cost;

    public Treatment(String treatment_type_id, String treatment_type, Long treatment_cost) {
        this.treatment_type_id = treatment_type_id;
        this.treatment_type = treatment_type;
        this.treatment_cost = treatment_cost;
    }
}

