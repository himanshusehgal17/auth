package com.xnet.auth.entities;

public class Employee {
    
    private int id;

    private String employee;

    private String emailAddress;

    public Employee() {
    }

    public Employee(int id, String employee, String emailAddress) {
        this.id = id;
        this.employee = employee;
        this.emailAddress = emailAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    
}
