package com.example.jimbobspethospital.Pets;

import org.springframework.data.jpa.repository.JpaRepository;

public interface petRepo extends JpaRepository<pet, Long> {
}
