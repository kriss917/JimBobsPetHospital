package com.example.jimbobspethospital.Staff;

import com.example.jimbobspethospital.Treatment.TreatmentRepo;
import com.example.jimbobspethospital.Treatment.TreatmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    private final StaffRepo staffRepo;

    private final TreatmentService treatmentService;

    public StaffService(StaffRepo staffRepo, TreatmentRepo treatmentRepo, TreatmentService treatmentService) {
        this.staffRepo = staffRepo;
        this.treatmentService = treatmentService;
    }

    public List<Staff> getAllStaff() {
        return staffRepo.findAll();
    }
    public Staff createStaff(StaffDto staff) {
        var treatment = treatmentService.getTreatmentById(staff.treatment_type_id());
        var newStaff = new Staff(staff.staff_name(), staff.staff_position(), staff.staff_email(), treatment);
        return staffRepo.save(newStaff);
    }
    public Staff getStaffById(long id) {
        return staffRepo.findById(id).orElse(null);
    }
    public void deleteStaffById(long id) {
        staffRepo.deleteById(id);
    }
    public void deleteAllStaff() {
        staffRepo.deleteAll();
    }
}
