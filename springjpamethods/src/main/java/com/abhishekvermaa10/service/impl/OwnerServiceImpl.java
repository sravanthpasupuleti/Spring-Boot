package com.abhishekvermaa10.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.abhishekvermaa10.dto.OwnerDTO;
import com.abhishekvermaa10.entity.Owner;
import com.abhishekvermaa10.exception.OwnerNotFoundException;
import com.abhishekvermaa10.repository.OwnerRepository;
import com.abhishekvermaa10.service.OwnerService;
import com.abhishekvermaa10.util.OwnerMapper;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class OwnerServiceImpl implements OwnerService {

	private final OwnerRepository ownerRepository;
	private final OwnerMapper ownerMapper;
	@Value("${owner.not.found}")
	private String ownerNotFound;

	

	@Override
	public OwnerDTO findOwner(int ownerId) throws OwnerNotFoundException {
		return ownerRepository.findById(ownerId)
				.map(ownerMapper::ownerToOwnerDTO)
				.orElseThrow(() -> new OwnerNotFoundException(String.format(ownerNotFound, ownerId)));
	}

	@Override
	public List<OwnerDTO> findOwnerWithFirstName(String firstName) throws OwnerNotFoundException {
		return ownerRepository.findByFirstName(firstName).stream()
								.map(owner -> ownerMapper.ownerToOwnerDTO(owner))
								.toList();
	}

	public OwnerDTO findOwnerWithPetId(int petId) throws OwnerNotFoundException{
		Owner owner = ownerRepository.findByPet_Id(petId);
		if(Objects.isNull(owner)){
			throw new OwnerNotFoundException(String.format(ownerNotFound, petId));
		}
		OwnerDTO ownerDTO = ownerMapper.ownerToOwnerDTO(owner);
		return ownerDTO;
	}

	// @Override
	// public void deleteOwner(int ownerId) throws OwnerNotFoundException {
	// 	Optional<Owner> optionalOwner = ownerRepository.findById(ownerId);
	// 	if (optionalOwner.isEmpty()) {
	// 		throw new OwnerNotFoundException(String.format(ownerNotFound, ownerId));
	// 	} else {
	// 		ownerRepository.deleteById(ownerId);
	// 	}
	// }

	// @Override
	// public List<OwnerDTO> findAllOwners() {
	// 	return ownerRepository.findAll()
	// 			.stream()
	// 			.map(ownerMapper::ownerToOwnerDTO)
	// 			.toList();
	// }

}
