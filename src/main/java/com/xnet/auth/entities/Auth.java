package com.xnet.auth.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Auth {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String emailAddress;

    private String password;

    private String employeeId;

    

    public Auth(int id, String emailAddress, String password, String employeeId) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.password = password;
        this.employeeId = employeeId;
    }

    public Auth() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    
    

}
