package com.example.jimbobspethospital.Staff;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    private final StaffRepo staffRepo;

    public StaffService(StaffRepo staffRepo) {
        this.staffRepo = staffRepo;
    }

    public List<Staff> getAllStaff() {
        return staffRepo.findAll();
    }
    public Staff createStaff(Staff staff) {
        return staffRepo.save(staff);
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
