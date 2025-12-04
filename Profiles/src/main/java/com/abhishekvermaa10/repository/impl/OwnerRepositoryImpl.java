package com.abhishekvermaa10.repository.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.abhishekvermaa10.repository.OwnerRepository;




@Repository
public class OwnerRepositoryImpl implements OwnerRepository {

	@Value("${owner.found}")
	private String owner_found;

	public OwnerRepositoryImpl() {
		System.out.println("OwnerRepositoryImpl bean created.");
	}

	@Override
	public String findOwner(int ownerId) {
		return String.format(owner_found, ownerId);
	}
}
