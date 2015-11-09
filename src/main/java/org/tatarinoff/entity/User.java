package org.tatarinoff.entity;

public class User {

    private Integer userId;
    private String name;
    private String pass;

    public User(String name, String pass) {
        this.pass = pass;
        this.name = name;
    }

    public User() {

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

