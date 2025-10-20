package com.example.jimbobspethospital.Pets;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pet")
public class petController {

    private final petService petService;

    public petController(com.example.jimbobspethospital.Pets.petService petService) {
        this.petService = petService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<pet> getPetById(@PathVariable Long id) {
        return ResponseEntity.ok(petService.getPetById(id));
    }

    @GetMapping("/init")
    public ResponseEntity<String> init() {
        return ResponseEntity.ok("noiemqw");
    }
}
