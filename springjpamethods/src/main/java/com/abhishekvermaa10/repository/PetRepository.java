package com.abhishekvermaa10.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishekvermaa10.entity.Pet;


public interface PetRepository extends JpaRepository<Pet, Integer>{
	
}
