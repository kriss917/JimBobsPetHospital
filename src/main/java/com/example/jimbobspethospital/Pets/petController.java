package com.example.jimbobspethospital.Pets;

import com.example.jimbobspethospital.Owner.Owner;
import com.example.jimbobspethospital.TestData.CreateTestData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pet")
public class petController {


    private final petService petService;
    private final CreateTestData createTestData;

    public petController(petService petService, CreateTestData createTestData) {
        this.petService = petService;
        this.createTestData = createTestData;
    }
    @GetMapping
    public ResponseEntity<List<Pet>> getAllOwners() {
        return ResponseEntity.ok(petService.getAllPet());

    }

    @GetMapping("/{id}")
    public ResponseEntity<Pet> getPetById(@PathVariable Long id) {
        return ResponseEntity.ok(petService.getPetById(id));
    }

    @GetMapping("/init")
    public ResponseEntity<String> init() {
        createTestData.createPetData();
        return ResponseEntity.ok("ok");
    }
}
