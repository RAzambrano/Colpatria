/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colpatria.colpatria.Service;

import com.colpatria.colpatria.Model.UserSecurityModel;
import com.colpatria.colpatria.Repository.UserSecurityRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ricardo
 */
@Service
public class UserSecurityService {
     @Autowired
     UserSecurityRepository    service;
     
     
     public Optional<UserSecurityModel>fiddById(Long id){
        return this.service.findById(id);
    }

     public UserSecurityModel login(String name, String lastName, String Password){
        
         
         return service.login(lastName,name);
     }
             
     
}
