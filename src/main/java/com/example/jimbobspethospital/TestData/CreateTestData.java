package com.example.jimbobspethospital.TestData;

import com.example.jimbobspethospital.Owner.Owner;
import com.example.jimbobspethospital.Owner.ownerService;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

@Service
public class CreateTestData {

    private final Faker faker;
    private final ownerService ownerService;

    public CreateTestData( ownerService ownerService) {
        this.faker = new Faker() ;
        this.ownerService = ownerService;
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
}
