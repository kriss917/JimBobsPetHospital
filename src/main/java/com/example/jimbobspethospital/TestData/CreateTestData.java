package com.example.jimbobspethospital.TestData;

import com.example.jimbobspethospital.Owner.Owner;
import com.example.jimbobspethospital.Owner.ownerService;
import com.example.jimbobspethospital.Pets.Pet;
import com.example.jimbobspethospital.Pets.petService;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreateTestData {

    private final Faker faker;
    private final ownerService ownerService;
    private final com.example.jimbobspethospital.Pets.petService petService;

    public CreateTestData(ownerService ownerService, petService petService) {
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

    public void createPetData(){
        List<Owner> owners = ownerService.getAllOwners();
        if (owners.isEmpty()){
            System.out.println("No owners found");
            return;
        }
        for (int i = 0; i < 50; i++) {
            Owner randomOwner = owners.get(2);
            Pet newPet = new Pet(
                    randomOwner,
                    faker.name().firstName(),
                    faker.animal().name(),
                    String.valueOf(faker.number().numberBetween(1, 15))
            );
            petService.createPet(newPet);
        }
    }
}
