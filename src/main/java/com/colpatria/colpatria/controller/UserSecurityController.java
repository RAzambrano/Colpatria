/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colpatria.colpatria.controller;

import com.colpatria.colpatria.Model.LoginI;
import com.colpatria.colpatria.Model.Token;
import com.colpatria.colpatria.Model.UserSecurityModel;
import com.colpatria.colpatria.Service.UserSecurityService;
import com.colpatria.colpatria.util.Data;
import com.colpatria.colpatria.util.Estructure;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ricardo
 */
@RestController
@RequestMapping("api/security")
public class UserSecurityController {
    @Autowired
    UserSecurityService service;
    
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/login")
    public Estructure login(@RequestBody LoginI log ){
        
       try {
           System.err.println(log.getName()+ log.getLastName()+ log.getPassword());
            UserSecurityModel user =   this.service.login(log.getName(), log.getLastName(), log.getPassword());
            if (user!=null ){
                if(user.getNombre().equals(log.getName()) && user.getLastName().equals(log.getLastName()) && user.getContrasena().equals(log.getPassword())){
                    
                    ArrayList<Token> listData = new ArrayList<Token>();
                    Token token = new Token(user.getId());
                    listData.add(token);
                    Data data = new Data();
                    data.setRows(listData);
                    data.setTotal(listData.size());
                                              
                    return new Estructure(true,"Conexion con exito ",HttpStatus.OK.value(),data);
                }else{
                    throw new Exception("Por favor valaidar sus credenciales");
                }
                
            } else {
                throw new Exception("No se encuentra informació sobre el usuario");
            }
        } catch (Exception ex) {
            return new Estructure(false,ex.getMessage(),HttpStatus.NOT_ACCEPTABLE.value(),new Data());
        }
    }
}
