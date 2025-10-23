package com.example.jimbobspethospital.TestData;

import com.example.jimbobspethospital.Owner.Owner;
import com.example.jimbobspethospital.Owner.OwnerService;
import com.example.jimbobspethospital.Pets.Pet;
import com.example.jimbobspethospital.Pets.PetDto;
import com.example.jimbobspethospital.Pets.PetService;
import com.example.jimbobspethospital.Staff.Staff;
import com.example.jimbobspethospital.Staff.StaffDto;
import com.example.jimbobspethospital.Staff.StaffService;
import com.example.jimbobspethospital.Treatment.Treatment;
import com.example.jimbobspethospital.Treatment.TreatmentService;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class CreateTestData {

    private final Faker faker;
    private final OwnerService ownerService;
    private final PetService petService;
    private final StaffService staffService;
    private final TreatmentService treatmentService;

    public CreateTestData(OwnerService ownerService, PetService petService, StaffService staffService, TreatmentService treatmentService) {
        this.staffService = staffService;
        this.treatmentService = treatmentService;
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
            Long randomOwner = owners.get(randomOwnerIndex).getOwner_id();
            PetDto newPet = new PetDto(
                    randomOwner,
                    faker.name().firstName(),
                    faker.animal().name(),
                    faker.number().numberBetween(1L, 15L)
            );
            petService.createPet(newPet);
        }
    }

    public void createTreatmentStaffData() {
        createTreatment();
        List<Treatment> treatments = treatmentService.getAllTreatments();
        for (int i = 0; i < 20; i++) {
            int randomTreatmentIndex = new Random().nextInt(treatments.size());
            Long randomTreatmentId = treatments.get(randomTreatmentIndex).getTreatment_type_id();
            StaffDto newStaff = new StaffDto(
                    faker.name().firstName(),
                    faker.job().position(),
                    faker.name().nameWithMiddle(),
                    randomTreatmentId
            );
            staffService.createStaff(newStaff);
        }
    }
    public void createTreatment() {
        for (int i = 0; i < 20; i++) {
            Treatment newTreatment = new Treatment(
                    faker.medical().diseaseName(),
                    faker.number().numberBetween(100L, 150000L)
            );
            treatmentService.createTreatment(newTreatment);
        }
    }
}
