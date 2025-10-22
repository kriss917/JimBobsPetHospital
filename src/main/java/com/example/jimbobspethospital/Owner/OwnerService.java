package com.example.jimbobspethospital.Owner;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

    private final OwnerRepo ownerRepo;

    public OwnerService(OwnerRepo ownerRepo) {
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
    public void deleteOwnerById(Long id) {
        ownerRepo.deleteById(id);
    }
    public void deleteAllOwners() {
        ownerRepo.deleteAll();
    }

}
