package com.abhishekvermaa10.repository;

import java.util.Optional;

import com.abhishekvermaa10.entity.Pet;


public interface PetRepository {
	
	Optional<Pet> findById(int petId);
	
}
