package com.abhishekvermaa10.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.abhishekvermaa10.entity.Pet;


public interface PetRepository extends JpaRepository<Pet, Integer> {

	@Query("SELECT obj FROM Pet obj JOIN FETCH obj.owner WHERE obj.id = :pet")
	Optional<Pet> findById(int petId);

	@Query("SELECT AVG(YEAR(CURRENT_DATE()) - YEAR(obj.birthDate)) FROM Pet obj")
    Optional<Pet> findAverageAgeOfPet();
}
