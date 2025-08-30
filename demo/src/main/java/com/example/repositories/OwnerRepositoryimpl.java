package com.example.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class OwnerRepositoryimpl implements OwnerRepository{

    public OwnerRepositoryimpl(){
        System.out.println("OwnerRepositoryimpl constructor is executed");
    }

    public String findid(int ownerid){
        return "owner id is "+ownerid;
    }
}
