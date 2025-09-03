package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.ownerexception.OwnerNotFoundException;
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
    public void modifyid(int idd) throws OwnerNotFoundException{
        if(idd%2 != 0){
            throw new OwnerNotFoundException("owner id should be even number");
        }else{
            this.id = idd;
        }
    }

    @Override
    public String serviceid(){
        return repo.findid(id);
    }
}
