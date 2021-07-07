/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colpatria.colpatria.controller;

import com.colpatria.colpatria.Model.LoginI;
import com.colpatria.colpatria.Model.UserModel;
import com.colpatria.colpatria.Service.UserService;
import com.colpatria.colpatria.util.Data;
import com.colpatria.colpatria.util.Estructure;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ricardo
 */
@RestController
@RequestMapping("api/usuario")
public class UserController {
    @Autowired
    UserService userService;
    
    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping()
    public Estructure findAll(){
        
       try {
       
            ArrayList<UserModel> users =  (ArrayList<UserModel>) this.userService.findAll();
            ArrayList<Data> listdata  = new ArrayList<Data>();
            Data data = new Data();
            data.setRows(users);
            data.setTotal(users.size());
            listdata.add(data);                            
            return new Estructure(true,"Conexion con exito",HttpStatus.OK.value(),data);
        } catch (Exception ex) {
            return new Estructure(false,ex.getMessage(),HttpStatus.NOT_ACCEPTABLE.value(),new Data());
        }
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/find")
    public Estructure findById(@RequestParam  Long id){
        
       try {
       
            Optional<UserModel> users =  this.userService.fiddById(id);
            if(users!=null){
                ArrayList<UserModel> user = new ArrayList<UserModel>();
                user.add(users.get());
                ArrayList<Data> listdata  = new ArrayList<Data>();
                Data data = new Data();
                data.setRows(user);
                data.setTotal(user.size());
                listdata.add(data);                            
                return new Estructure(true,"Conexion con exito",HttpStatus.OK.value(),data);
            }
            throw new Exception("Por favor valaidar la informacion del usuario");
        } catch (Exception ex) {
            return new Estructure(false,ex.getMessage(),HttpStatus.NOT_ACCEPTABLE.value(),new Data());
        }
    }
    
}
