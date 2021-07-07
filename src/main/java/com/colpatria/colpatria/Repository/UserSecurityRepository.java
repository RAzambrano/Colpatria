/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colpatria.colpatria.Repository;


import com.colpatria.colpatria.Model.UserSecurityModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ricardo
 */
@Repository
public interface UserSecurityRepository extends  CrudRepository<UserSecurityModel, Long>{
    @Query(value="select * from ods.usuario_seguridad where ods.usuario_seguridad.last_name = :lastName and ods.usuario_seguridad.nombre = :nombre ", nativeQuery = true)
    public UserSecurityModel login (@Param("lastName")String lastName, @Param("nombre")String name);
    
}
