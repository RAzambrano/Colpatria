/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colpatria.colpatria.Service;

import com.colpatria.colpatria.Model.UserModel;
import com.colpatria.colpatria.Repository.UserRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ricardo
 */
@Service
public class UserService  {
    @Autowired
    UserRepository userRespository;
    
   
    public ArrayList<UserModel> findAll() {
        ArrayList<UserModel> users = new ArrayList<>();
        users = (ArrayList<UserModel>) this.userRespository.findAll();
        return users;
        }

    public Optional<UserModel>fiddById(Long id){
        return this.userRespository.findById(id);
    }  
    
}
