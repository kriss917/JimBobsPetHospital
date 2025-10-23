package com.example.jimbobspethospital.Treatment;

import com.example.jimbobspethospital.TestData.CreateTestData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/treatment")
public class TreatmentController {

    private final TreatmentService treatmentService;
    private final CreateTestData createTestData;

    public TreatmentController(TreatmentService treatmentService, CreateTestData createTestData) {
        this.treatmentService = treatmentService;
        this.createTestData = createTestData;
    }

    @GetMapping("/init")
    public ResponseEntity<String> create(Treatment treatment) {
        createTestData.createTreatment();
        return ResponseEntity.ok("Treatments created");
}
    @GetMapping
    public List<Treatment> getAllTreatment() {
        return treatmentService.getAllTreatments();

    }
    @GetMapping("/{id}")
    public Treatment getTreatmentById(@PathVariable Long id) {
        return treatmentService.getTreatmentById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteTreatmentById(@PathVariable Long id) {
        treatmentService.deleteTreatmentById(id);
    }
    @DeleteMapping("/all")
    public void deleteAllTreatment() {
        treatmentService.deleteAllTreatments();
    }
    @PostMapping
    public Treatment createTreatment(@RequestBody Treatment treatment) {
        return treatmentService.createTreatment(treatment);
    }

}