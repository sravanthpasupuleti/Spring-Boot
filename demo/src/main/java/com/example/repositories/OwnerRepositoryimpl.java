package com.example.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OwnerRepositoryimpl implements OwnerRepository{

    public OwnerRepositoryimpl(){
        System.out.println("OwnerRepositoryimpl constructor is executed");
    }

    public String findid(int ownerid){
        return "owner id is "+ownerid;
    }
}
