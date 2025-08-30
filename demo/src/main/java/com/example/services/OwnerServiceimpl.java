package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.repositories.OwnerRepository;

@Component
public class OwnerServiceimpl implements OwnerService{

    @Autowired
    private OwnerRepository repo;

    @Value("4")
    private int id;

    public OwnerServiceimpl(){
        System.out.println("OwnerServiceimpl constructor executed");
    }

    public String serviceid(){
        return repo.findid(id);
    }
}
