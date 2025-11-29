package com.abhishekvermaa10.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.abhishekvermaa10.repository.OwnerRepository;
import com.abhishekvermaa10.service.OwnerService;

@Service("ownerService") //and also here you can rename your bean anme
public class OwnerServiceImpl implements OwnerService {
	@Autowired    //property-based auto wiring
	private OwnerRepository ownerRepository;
	@Value("9")
	private int ownerId;

	// @Autowired
	// public OwnerServiceImpl(OwnerRepository ownerRepository, @Value("7") int ownerId) {   //Construcor based Autowired
	// 	this.ownerRepository = ownerRepository;
	// 	this.ownerId = ownerId;
	// 	System.out.println("OwnerServiceImpl bean created.");
	// }

	public OwnerServiceImpl() {
		System.out.println("OwnerServiceImpl default bean created.");
	}

	@Override
	public String findOwner() {
		return ownerRepository.findOwner(ownerId);
	}
}
