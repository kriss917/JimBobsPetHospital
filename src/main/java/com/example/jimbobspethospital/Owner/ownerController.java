package com.example.jimbobspethospital.Owner;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/owner")
public class ownerController {

    private final ownerService ownerService;

    public ownerController(ownerService ownerService) {
        this.ownerService = ownerService;
    }



    @GetMapping()
    public String getOwner() {
        return "boobies";
    }

    @GetMapping("/init")
    public ResponseEntity<String> initOwners(){
        return ResponseEntity.ok("ok");
    }
}
