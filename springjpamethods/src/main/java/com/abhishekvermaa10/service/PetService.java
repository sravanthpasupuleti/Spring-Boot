package com.abhishekvermaa10.service;

import com.abhishekvermaa10.dto.PetDTO;
import com.abhishekvermaa10.exception.PetNotFoundException;


public interface PetService {
	
	PetDTO findPet(int petId) throws PetNotFoundException;
	
}
