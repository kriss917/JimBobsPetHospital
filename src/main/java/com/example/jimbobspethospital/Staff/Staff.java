package com.example.jimbobspethospital.Staff;

import com.example.jimbobspethospital.Treatment.Treatment;
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

    @Column(name = "staff_name")
    private String staff_name;

    @Column(name = "staff_position")
    private String staff_position;

    @Column(name = "staff_email")
    private String staff_email;

    @ManyToOne
    @JoinColumn(name = "treatment_type_id")
    private Treatment treatment_type_id;

    public Staff(String staff_name, String staff_position, String staff_email, Treatment treatment_type_id) {
        this.staff_name = staff_name;
        this.staff_position = staff_position;
        this.staff_email = staff_email;
        this.treatment_type_id = treatment_type_id;
    }
}

