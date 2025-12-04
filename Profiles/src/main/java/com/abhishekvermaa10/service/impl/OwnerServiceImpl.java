package com.abhishekvermaa10.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.abhishekvermaa10.exception.OwnerNotFoundException;
import com.abhishekvermaa10.repository.OwnerRepository;
import com.abhishekvermaa10.service.OwnerService;

@Profile("local")
@Service
public class OwnerServiceImpl implements OwnerService {
	@Autowired
	private OwnerRepository ownerRepository;

	@Value("${owner.id}")
	private int ownerId;

	@Value("${owner.exc}")
	private String owner_exc;

	public OwnerServiceImpl() {
		System.out.println("OwnerServiceImpl bean created.");
	}

	public void ModifyOwnerId(int id) throws OwnerNotFoundException{
		if(id%2 == 0){
			this.ownerId = id;
		}else{
			throw new OwnerNotFoundException(owner_exc);
		}
	}

	@Override
	public String findOwner() {
		return ownerRepository.findOwner(ownerId);
	}
}
