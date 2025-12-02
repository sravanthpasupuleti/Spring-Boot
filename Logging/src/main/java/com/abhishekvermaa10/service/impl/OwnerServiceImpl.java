package com.abhishekvermaa10.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.abhishekvermaa10.exception.OwnerNotFoundException;
import com.abhishekvermaa10.repository.OwnerRepository;
import com.abhishekvermaa10.service.OwnerService;

@Service
public class OwnerServiceImpl implements OwnerService {
	@Autowired
	private OwnerRepository ownerRepository;
	@Value("10")
	private int ownerId;

	public OwnerServiceImpl() {
		System.out.println("OwnerServiceImpl bean created.");
	}

	public void ModifyOwnerId(int id) throws OwnerNotFoundException{
		if(id%2 == 0){
			this.ownerId = id;
		}else{
			throw new OwnerNotFoundException("Please Enter Even number Owner Id");
		}
	}

	@Override
	public String findOwner() {
		return ownerRepository.findOwner(ownerId);
	}
}
