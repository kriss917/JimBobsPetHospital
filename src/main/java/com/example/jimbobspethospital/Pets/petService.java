package com.example.jimbobspethospital.Pets;

import org.springframework.stereotype.Service;

@Service
public class petService {

    private final petRepo petRepository;

    public petService(petRepo petRepository) {

        this.petRepository = petRepository;

    }

    public pet getPetById(Long id) {
        return petRepository.findById(id).orElse(null);
    }
}
