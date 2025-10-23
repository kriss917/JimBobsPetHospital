package com.example.jimbobspethospital.Staff;

public record StaffDto(
       String staff_name,
       String staff_position,
       String staff_email,
       Long treatment_type_id
) {
}
