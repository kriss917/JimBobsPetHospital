package com.example.jimbobspethospital.Owner;

import org.springframework.stereotype.Service;

@Service
public class ownerService {

    private final ownerRepo ownerRepo;

    public ownerService(ownerRepo ownerRepo) {
        this.ownerRepo = ownerRepo;
    }

    public Owner createOwner(Owner theOwner) {
        return ownerRepo.save(theOwner);
    }
}
