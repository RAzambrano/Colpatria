/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colpatria.colpatria.Repository;

import com.colpatria.colpatria.Model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ricardo
 */
@Repository
public interface UserRepository extends  CrudRepository<UserModel, Long>{
    /* public ArrayList<UserModel> listUser() ;*/
}
