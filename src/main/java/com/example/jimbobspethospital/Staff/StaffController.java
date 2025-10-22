package com.example.jimbobspethospital.Staff;

import com.example.jimbobspethospital.TestData.CreateTestData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/staff")
public class StaffController {
    private StaffService staffService;
    private CreateTestData createTestData;

}
