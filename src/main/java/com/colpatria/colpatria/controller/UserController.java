/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colpatria.colpatria.controller;

import com.colpatria.colpatria.util.Data;
import com.colpatria.colpatria.util.Estructure;
import java.util.ArrayList;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ricardo
 */
@RestController
@RequestMapping("/usuario")
public class UserController {
    
    @GetMapping()
    public Estructure about(){
        
           try {
                                      
         return new Estructure(true,"Conexion con exito",HttpStatus.OK.value(),new ArrayList<Data>());
           
           
        } catch (Exception ex) {
            return new Estructure(false,ex.getMessage(),HttpStatus.NOT_ACCEPTABLE.value(),new ArrayList<Data>());
        }
       
    }
    
}
