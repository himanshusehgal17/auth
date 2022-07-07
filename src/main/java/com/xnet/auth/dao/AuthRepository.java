package com.xnet.auth.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.xnet.auth.entities.Auth;


public interface AuthRepository extends CrudRepository<Auth, Integer> {

    public List<Auth> findByEmailAddressAndPassword(String emailAddress, String password);

}
