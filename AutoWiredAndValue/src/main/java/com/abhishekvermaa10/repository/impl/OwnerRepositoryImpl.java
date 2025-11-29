package com.abhishekvermaa10.repository.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.abhishekvermaa10.repository.OwnerRepository;

@Primary
@Repository("common")
public class OwnerRepositoryImpl implements OwnerRepository {

	public OwnerRepositoryImpl() {
		System.out.println("OwnerRepositoryImpl bean created.");
	}

	@Override
	public String findOwner(int ownerId) {
		return String.format("Found common owner with ownerId %s", ownerId);
	}
}
