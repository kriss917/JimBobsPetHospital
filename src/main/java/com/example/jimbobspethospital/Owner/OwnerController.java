package com.example.jimbobspethospital.Owner;

import com.example.jimbobspethospital.TestData.CreateTestData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/owner")
public class OwnerController {

    private final CreateTestData createTestData;

    private final OwnerService ownerService;

    public OwnerController(CreateTestData createTestData, OwnerService ownerService) {
        this.createTestData = createTestData;
        this.ownerService = ownerService;
    }

    @GetMapping("/init")
    public ResponseEntity<String> initOwners(){
        createTestData.createOwnerData();
        return ResponseEntity.ok("ok");
    }

    @GetMapping()
    public ResponseEntity<List<Owner>> getAllOwners() {
        return ResponseEntity.ok(ownerService.getAllOwners());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Owner> getOwnerById(@PathVariable Long id){
        return ResponseEntity.ok(ownerService.getOwnerById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOwnerById(@PathVariable Long id){
        ownerService.deleteOwnerById(id);
        return ResponseEntity.ok("deleted owner: "+ id);
    }
    @DeleteMapping("/all")
    public ResponseEntity<String> deleteAllOwners(){
        ownerService.deleteAllOwners();
        return ResponseEntity.ok("Deleted all current owners");
    }

    @PostMapping
    public ResponseEntity<Owner> createOwner(@RequestBody Owner owner){
      Owner lastOwnerCreated = ownerService.createOwner(owner);
        return ResponseEntity.ok(lastOwnerCreated);
    }
}
