/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colpatria.colpatria.Service;

import com.colpatria.colpatria.Model.UserModel;
import com.colpatria.colpatria.Repository.UserRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ricardo
 */
@Service
public class UserService implements UserRepository {
    @Autowired
    UserRepository userRespository;
    
    @Override
    public ArrayList<UserModel> listUser() {
        ArrayList<UserModel> users = new ArrayList<>();
        
        UserModel user1 = new UserModel(Long.parseLong("1"),"Ricardo", "r@gmail.com",1,"123456","Zambrano");
        UserModel user2 = new UserModel(Long.parseLong("4"),"Alfonso", "a@gmail.com",1,"123456","Daza");
        users.add(user1);
        users.add(user2);
        
        return users;
        
    }
    
}
