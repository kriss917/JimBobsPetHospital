package com.example.jimbobspethospital.Owner;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ownerService {

    private final ownerRepo ownerRepo;

    public ownerService(ownerRepo ownerRepo) {
        this.ownerRepo = ownerRepo;
    }

    public Owner createOwner(Owner theOwner) {
        return ownerRepo.save(theOwner);
    }
    public List<Owner> getAllOwners() {
        return ownerRepo.findAll();
    }
    public Owner getOwnerById(Long id) {
        return ownerRepo.findById(id).orElse(null);
    }
}
