package com.example.jimbobspethospital.Treatment;

import com.example.jimbobspethospital.Staff.Staff;
import com.example.jimbobspethospital.TestData.CreateTestData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreatmentService {

    private final TreatmentRepo treatmentRepo;

    public TreatmentService(TreatmentRepo treatmentRepo) {
        this.treatmentRepo = treatmentRepo;
    }
    public Treatment createTreatment(Treatment treatment) {
        return treatmentRepo.save(treatment);
    }
    public List<Treatment> getAllTreatments() {
        return treatmentRepo.findAll();
    }
    public Treatment getTreatmentById(long id) {
        return treatmentRepo.findById(id).orElse(null);
    }
    public void deleteTreatmentById(long id) {
        treatmentRepo.deleteById(id);
    }
    public void deleteAllTreatments() {
        treatmentRepo.deleteAll();
    }
}
