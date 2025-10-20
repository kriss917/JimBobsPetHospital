package com.example.jimbobspethospital.Pets;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class petService {

    private final petRepo petRepository;

    public petService(petRepo petRepository) {
        this.petRepository = petRepository;
    }

    public Pet createPet(Pet thePet) {
        return petRepository.save(thePet);
    }
    public List<Pet> getAllPet() {
        return petRepository.findAll();
    }

    public Pet getPetById(Long id) {
        return petRepository.findById(id).orElse(null);
    }
}
