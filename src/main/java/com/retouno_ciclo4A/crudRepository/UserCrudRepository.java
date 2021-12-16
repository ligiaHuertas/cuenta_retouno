/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.retouno_ciclo4A.crudRepository;

import com.retouno_ciclo4A.modelo.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Maria Ligia Huertas Moreno
 */
public interface UserCrudRepository extends CrudRepository<User,Integer>{
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    
}

