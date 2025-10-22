package com.example.jimbobspethospital.Treatment;

import com.example.jimbobspethospital.TestData.CreateTestData;
import org.springframework.stereotype.Service;

@Service
public class TreatmentService {

    private final CreateTestData createTestData;

    private final TreatmentRepo treatmentRepo;


    public TreatmentService(CreateTestData createTestData, TreatmentRepo treatmentRepo) {
        this.createTestData = createTestData;
        this.treatmentRepo = treatmentRepo;
    }
    public Treatment createTreatment(Treatment treatment) {
        return treatmentRepo.save(treatment);
    }
}
