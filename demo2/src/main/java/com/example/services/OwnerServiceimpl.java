package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.repositories.OwnerRepository;

@Service
public class OwnerServiceimpl implements OwnerService{

    @Autowired
    private OwnerRepository ownerRepository;

    @Value("${owner.id}")
    private int id;

    public OwnerServiceimpl(){
        System.out.println("OwnerServiceimpl Constructor is executed");
    }

    @Override
    public String Serviceid(){
        return ownerRepository.findid(id);
    }
}