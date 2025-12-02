package com.abhishekvermaa10.service;

import com.abhishekvermaa10.exception.OwnerNotFoundException;

public interface OwnerService {
	String findOwner();

	void ModifyOwnerId(int id) throws OwnerNotFoundException;
}