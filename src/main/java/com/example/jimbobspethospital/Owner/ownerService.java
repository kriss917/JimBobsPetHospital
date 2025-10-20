package com.example.jimbobspethospital.Owner;

import com.example.jimbobspethospital.Pets.petService;
import org.springframework.stereotype.Service;

@Service
public class ownerService {

    private final ownerRepo ownerRepo;

    public ownerService(ownerRepo ownerRepo) {
        this.ownerRepo = ownerRepo;
    }
}
