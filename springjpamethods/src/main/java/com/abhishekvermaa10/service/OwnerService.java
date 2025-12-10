package com.abhishekvermaa10.service;

import java.util.List;

import com.abhishekvermaa10.dto.OwnerDTO;
import com.abhishekvermaa10.exception.OwnerNotFoundException;


public interface OwnerService {

	OwnerDTO findOwner(int ownerId) throws OwnerNotFoundException;

	List<OwnerDTO> findOwnerWithFirstName(String firstName) throws OwnerNotFoundException;

	OwnerDTO findOwnerWithPetId(int petId) throws OwnerNotFoundException;

	// void deleteOwner(int ownerId) throws OwnerNotFoundException;

	// List<OwnerDTO> findAllOwners();
	
}
