package com.gude.model;

/**
 * @Author Gude.
 * @Date 2017/4/8.
 */
public class Person {
    private String username;
    private String password;

    public Person() {

    }

    public Person(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
