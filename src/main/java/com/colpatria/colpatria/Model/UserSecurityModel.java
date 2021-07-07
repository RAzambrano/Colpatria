/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colpatria.colpatria.Model;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

/**
 *
 * @author Ricardo
 */
@Entity
@Table(name="usuario_seguridad")
public class UserSecurityModel {
    @Id
    @Column(unique = true , nullable = false)   
    private long id;
    String contrasena;
    String nombre;
    String lastName;

    public UserSecurityModel() {
    }

    public UserSecurityModel(long id, String contrasena, String nombre, String lastName) {
        this.id = id;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.lastName = lastName;
    }

    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
}
