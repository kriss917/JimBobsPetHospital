package com.example.jimbobspethospital.Appointment;

import com.example.jimbobspethospital.Pets.Pet;
import com.example.jimbobspethospital.Treatment.Treatment;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private Long appointment_id;

    @Column(name="appointment_duration")
    private String appointment_duration;

    @Column(name="appointment_date")
    private String appointment_date;

    @ManyToOne
    @JoinColumn(name = "pet_id_pet_id")
    private Pet pet_id;
    @ManyToOne
    @JoinColumn(name = "treatment_type_id")
    private Treatment treatment_type_id;



}
