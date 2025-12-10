package com.abhishekvermaa10.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishekvermaa10.entity.Owner;


public interface OwnerRepository extends JpaRepository<Owner, Integer>{
	
}
