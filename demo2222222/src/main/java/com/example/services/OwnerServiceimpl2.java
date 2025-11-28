package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.example.exception.OddnumberException;
import com.example.repositories.OwnerRepository;

public class OwnerServiceimpl2 implements OwnerService{

    @Autowired
    OwnerRepository ownerRepository;

    @Value("${owner.id}")
    private int id;

    public OwnerServiceimpl2(){
        System.out.println("OwnerServiceimpl Second Constructor is Executed");
    }

    @Override
    public String Serviceid() {
        return ownerRepository.findid(id);
    }

    @Override
    public void getid(int id) throws Exception{
        if(id%2 != 0){
            throw new OddnumberException("owner id dont should be odd number");
        }
    }
}
