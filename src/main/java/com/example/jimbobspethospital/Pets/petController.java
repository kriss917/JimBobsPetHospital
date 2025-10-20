package com.example.jimbobspethospital.Pets;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pet")
public class petController {

    private final petService petService;

    public petController(com.example.jimbobspethospital.Pets.petService petService) {
        this.petService = petService;
    }


}
