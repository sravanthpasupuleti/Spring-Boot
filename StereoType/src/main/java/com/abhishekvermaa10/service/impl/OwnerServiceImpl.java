package com.abhishekvermaa10.service.impl;

import org.springframework.stereotype.Service;

import com.abhishekvermaa10.repository.OwnerRepository;
import com.abhishekvermaa10.service.OwnerService;

@Service //and also here you can rename your bean anme
public class OwnerServiceImpl implements OwnerService {
	private OwnerRepository ownerRepository;
	private int ownerId;

	// public OwnerServiceImpl(OwnerRepository ownerRepository, int ownerId) {   //Construcor based dependency injection
	// 	this.ownerRepository = ownerRepository;
	// 	this.ownerId = ownerId;
	// 	System.out.println("OwnerServiceImpl bean created.");
	// }

	public OwnerServiceImpl() {
		System.out.println("OwnerServiceImpl default bean created.");
	}

	public void setOwnerRepository(OwnerRepository ownerRepository){   //setter  based dependency injection
		this.ownerRepository =ownerRepository;
	}

	public void setOwnerId(int ownerid){
		ownerId = ownerid;
	}


	@Override
	public String findOwner() {
		return ownerRepository.findOwner(ownerId);
	}
}
