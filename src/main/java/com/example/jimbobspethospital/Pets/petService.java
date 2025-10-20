package com.example.jimbobspethospital.Pets;

import org.springframework.stereotype.Service;

@Service
public class petService {
    private final petController petController;
    private final petRepo petRepository;

    public petService(petController petController, petRepo petRepository) {
        this.petController = petController;
        this.petRepository = petRepository;

    }

    public pet getPetById(Long id) {
        return petRepository.findById(id).orElse(null);
    }
}
