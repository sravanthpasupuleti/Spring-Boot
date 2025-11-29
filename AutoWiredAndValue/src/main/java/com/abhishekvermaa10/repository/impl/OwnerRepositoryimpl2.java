package com.abhishekvermaa10.repository.impl;

import org.springframework.stereotype.Repository;

import com.abhishekvermaa10.repository.OwnerRepository;

@Repository("special")
public class OwnerRepositoryimpl2 implements OwnerRepository{

    public OwnerRepositoryimpl2(){
        System.out.println("OwnerRepository special bean was executed");
    }

    @Override
    public String findOwner(int id){
        return String.format("found special owner id with %d",id);
    }
}
