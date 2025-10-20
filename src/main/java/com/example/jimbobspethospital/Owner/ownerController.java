package com.example.jimbobspethospital.Owner;

import com.example.jimbobspethospital.TestData.CreateTestData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/owner")
public class ownerController {

    private final CreateTestData createTestData;

    private final ownerService ownerService;

    public ownerController(CreateTestData createTestData, ownerService ownerService) {
        this.createTestData = createTestData;
        this.ownerService = ownerService;
    }

    @GetMapping()
    public ResponseEntity<List<Owner>> getOwner() {
        return ResponseEntity.ok(ownerService.getAllOwners());
    }

    @GetMapping("/init")
    public ResponseEntity<String> initOwners(){
        createTestData.createOwnerData();
        return ResponseEntity.ok("ok");
    }
}
