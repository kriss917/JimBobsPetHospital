package com.example.jimbobspethospital.Pets;

public record PetDto(
        Long owner_id,
        String pet_name,
        String pet_type,
        Long age
) {}
