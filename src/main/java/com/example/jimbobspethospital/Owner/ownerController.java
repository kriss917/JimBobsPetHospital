package com.example.jimbobspethospital.Owner;

import com.example.jimbobspethospital.TestData.CreateTestData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public ResponseEntity<Owner> getOwnerById(@PathVariable Long id){
        return ResponseEntity.ok(ownerService.getOwnerById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOwnerById(@PathVariable Long id){
        return ResponseEntity.ok("deleted owner: "+ id);
    }
}
