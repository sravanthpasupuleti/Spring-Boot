package com.abhishekvermaa10.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.abhishekvermaa10.entity.Owner;


public interface OwnerRepository extends JpaRepository<Owner, Integer>{

	@Query("SELECT obj FROM Owner obj JOIN FETCH obj.pet WHERE obj.id = :ownerId")
	Owner findOwnerById(int ownerId);

	@Query("SELECT obj FROM Owner obj JOIN FETCH obj.pet WHERE obj.firstName LIKE CONCAT(:firstName,'%')")
	List<Owner> findByFirstNameStartsWith(String firstName);

	@Query("SELECT obj FROM Owner obj JOIN FETCH obj.pet WHERE obj.pet.id = :petId")
	Owner findOwnerByPetId(int petId);

	@Query("SELECT obj FROM Owner obj JOIN FETCH obj.pet WHERE obj.pet.birthDate BETWEEN :startDate AND :endDate")
	List<Owner> findAllOwnersByPetDateOfBirthRange(LocalDate startDate , LocalDate endDate);

	@Query("SELECT obj.id , obj.firstName , obj.lastName , obj.pet.name FROM Owner obj JOIN obj.pet")
	List<Object[]> findIdAndFirstNameAndLastNameAndPetName(Pageable pageable);
}
