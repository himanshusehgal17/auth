package com.xnet.auth.services;

import java.lang.StackWalker.Option;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xnet.auth.dao.AuthRepository;
import com.xnet.auth.entities.Auth;

@Component
public class AuthService {

    @Autowired
    public AuthRepository authRepository;

    public Auth findAuthByEmailAddressAndPassword(Auth auth) {
        List<Auth> list = authRepository.findByEmailAddressAndPassword(auth.getEmailAddress(), auth.getPassword());
        if(list.size() == 1) return list.get(0);
        return null;
    }

}
