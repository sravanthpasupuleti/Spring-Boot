package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.repositories.OwnerRepository;

@Scope("prototype")
@Service
public class OwnerServiceimpl implements OwnerService{

    @Autowired
    private OwnerRepository repo;

    @Value("4")
    private int id;

    public OwnerServiceimpl(){
        System.out.println("OwnerServiceimpl constructor executed");
    }

    @Override
    public void modifyid(int idd){
        this.id = idd;
    }

    @Override
    public String serviceid(){
        return repo.findid(id);
    }
}
