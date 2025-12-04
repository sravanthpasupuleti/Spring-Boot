package com.abhishekvermaa10.service.mock.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.abhishekvermaa10.exception.OwnerNotFoundException;
import com.abhishekvermaa10.repository.OwnerRepository;
import com.abhishekvermaa10.service.OwnerService;

@Profile("prod")
@Service
public class OwnerServiceImpl implements OwnerService {
	@Autowired
	private OwnerRepository ownerRepository;

	@Value("${owner.id}")
	private int ownerId;

	@Value("${owner.exc}")
	private String owner_exc;

	public OwnerServiceImpl() {
		System.out.println("OwnerServiceImpl mock bean created.");
	}

	public void ModifyOwnerId(int id) throws OwnerNotFoundException{
		this.ownerId = id;
	}

	@Override
	public String findOwner() {
		return ownerRepository.findOwner(ownerId);
	}
}
