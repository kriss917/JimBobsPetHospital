package com.example.jimbobspethospital.Staff;

import com.example.jimbobspethospital.TestData.CreateTestData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffController {
    private final StaffService staffService;
    private final CreateTestData createTestData;

    public StaffController(StaffService staffService, CreateTestData createTestData) {
        this.staffService = staffService;
        this.createTestData = createTestData;
    }

    @GetMapping
    public ResponseEntity<List<Staff>> findAll() {
       return ResponseEntity.ok(staffService.getAllStaff());
    }
    @GetMapping("/init")
    public ResponseEntity<String> createStaff(Staff staff) {
       createTestData.createStaff();
       return ResponseEntity.ok("Created staff");

    }
    @GetMapping("/{id}")
    public ResponseEntity<Staff> findById(@PathVariable Long id) {
        return ResponseEntity.ok(staffService.getStaffById(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStaff(@PathVariable Long id) {
        staffService.deleteStaffById(id);
        return ResponseEntity.ok("Staff deleted");
    }
    @DeleteMapping("/all")
    public ResponseEntity<String> deleteAllStaff() {
        staffService.deleteAllStaff();
        return ResponseEntity.ok("Staff deleted");
    }
    @PostMapping
    public ResponseEntity<Staff> saveStaff(@RequestBody Staff staff) {
        return  ResponseEntity.ok(staffService.createStaff(staff));
    }
}
