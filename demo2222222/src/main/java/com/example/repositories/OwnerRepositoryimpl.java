package com.example.repositories;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class OwnerRepositoryimpl implements OwnerRepository{

    @Value("${owner.value}")
    private String owner;

    public OwnerRepositoryimpl(){
        System.out.println("OwnerRepositoryimpl Constructor is executed");
    }

    @Override
    public String findid(int ownerid){
        return(String.format(owner,ownerid));
    }
}