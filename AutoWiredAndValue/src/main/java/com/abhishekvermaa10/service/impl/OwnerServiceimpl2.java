package com.abhishekvermaa10.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.abhishekvermaa10.repository.OwnerRepository;
import com.abhishekvermaa10.service.OwnerService;

@Service("specialOwnerService")
public class OwnerServiceimpl2 implements OwnerService{

    @Qualifier("special")
    @Autowired
    private OwnerRepository ownerRepository;

    @Value("11")
    private int id;

    public OwnerServiceimpl2(){
        System.out.println("OwnerServiceimpl2 special bean executed");
    }

    @Override
    public String findOwner(){
        return ownerRepository.findOwner(id);
    }
}
