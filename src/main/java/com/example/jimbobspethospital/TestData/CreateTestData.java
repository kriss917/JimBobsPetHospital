package com.example.jimbobspethospital.TestData;

import com.example.jimbobspethospital.Owner.Owner;
import com.example.jimbobspethospital.Owner.OwnerService;
import com.example.jimbobspethospital.Pets.Pet;
import com.example.jimbobspethospital.Pets.PetService;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class CreateTestData {

    private final Faker faker;
    private final OwnerService ownerService;
    private final PetService petService;

    public CreateTestData(OwnerService ownerService, PetService petService) {
        this.faker = new Faker() ;
        this.ownerService = ownerService;
        this.petService = petService;
    }

    public void createOwnerData(){
        for (int i = 0; i < 50; i++) {
            Owner newOwner = new Owner(
                    faker.name().firstName(),
                    faker.name().name(),
                    faker.address().fullAddress()
            );
            ownerService.createOwner(newOwner);
        }
    }

    public void createOwnerPetData(){
        createOwnerData();
        List<Owner> owners = ownerService.getAllOwners();
        for (int i = 0; i < 50; i++) {
            int randomOwnerIndex = new Random().nextInt(owners.size());
            Owner randomOwner = owners.get(randomOwnerIndex);
            Pet newPet = new Pet(
                    randomOwner,
                    faker.name().firstName(),
                    faker.animal().name(),
                    faker.number().numberBetween(1L, 15L)
            );
            petService.createPet(newPet);
        }
    }
}
