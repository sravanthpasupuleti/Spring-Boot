package com.example.services;

import com.example.ownerexception.OwnerNotFoundException;

public interface  OwnerService {
    String serviceid();

    void modifyid(int idd) throws OwnerNotFoundException;
}
