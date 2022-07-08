package com.xnet.auth.controllers;

import java.util.HashMap;
import java.util.Map;

import com.xnet.auth.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xnet.auth.entities.Auth;
import com.xnet.auth.helper.JwtTokenUtil;
import com.xnet.auth.services.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @PostMapping("/signIn")
    public Map<String, String> signIn(@RequestBody Auth auth) {
        Auth auth2 = authService.findAuthByEmailAddressAndPassword(auth);

        Map<String, Object> map = new HashMap<>();
        map.put("employeeId", auth2.getEmployeeId());
        map.put("emailAddress", auth2.getEmailAddress());
        String token = jwtTokenUtil.generateToken(map);
        map.clear();
        Map<String, String> map1 = new HashMap<>();
        map1.put("accessToken", token);
        return map1;

    }

//    @PostMapping("/create")
//    public String createNewEmployee(@RequestBody Object object) {
//        Auth auth = (Auth) object;
//        Employee employee = (Employee) object.get
//         return object.toString();
//    }



}
