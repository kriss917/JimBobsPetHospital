package com.example.jimbobspethospital.Treatment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreatmentRepo extends JpaRepository<Treatment, Long> {
}
