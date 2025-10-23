package com.example.jimbobspethospital.Pets;


import com.example.jimbobspethospital.Owner.OwnerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    private final PetRepo petRepository;
    private final OwnerService ownerService;

    public PetService(PetRepo petRepository, OwnerService ownerService) {
        this.petRepository = petRepository;
        this.ownerService = ownerService;
    }

    public Pet createPet(PetDto pet) {
        var owner = ownerService.getOwnerById(pet.owner_id());
        var petCreated = new Pet(owner, pet.pet_name(), pet.pet_type(), pet.age());
        return petRepository.save(petCreated);
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
