package com.example.jimbobspethospital.Owner;


import com.example.jimbobspethospital.Pets.pet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/owner")
public class ownerController {

    @GetMapping()
    public String getOwner() {
        return "boobies";
    }
}
