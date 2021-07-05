/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colpatria.colpatria.Repository;

import com.colpatria.colpatria.Model.UserModel;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ricardo
 */
@Repository
public interface UserRepository {
    
    public ArrayList<UserModel> listUser ();
}
