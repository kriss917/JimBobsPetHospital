package com.example.jimbobspethospital.Pets;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    private final PetRepo petRepository;

    public PetService(PetRepo petRepository) {
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

    public void deletePetById(Long id) {
        petRepository.deleteById(id);
    }
}
