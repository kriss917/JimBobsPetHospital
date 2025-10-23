package com.example.jimbobspethospital.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppointmentService {

    private final AppointmentRepo appointmentRepo;

    public AppointmentService(AppointmentRepo appointmentRepo) {
        this.appointmentRepo = appointmentRepo;
    }


    public Appointment createAppointment(Appointment theAppointment) {
        return appointmentRepo.save(theAppointment);

    }
    public List<Appointment> getAllAppointments() {
        return appointmentRepo.findAll();
    }
    public Appointment getAppointmentById(Long id) {
        return appointmentRepo.findById(id).orElse(null);
    }
    public void deleteAppointmentById(Long id) {
        appointmentRepo.deleteById(id);
    }
    public void deleteAllAppointments() {
        appointmentRepo.deleteAll();
    }

}
