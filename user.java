/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author Raiza Rahman
 */
public class user {
    private String name, username, password;

    user(String name, String username, String password){
        this.name = name;
        this.username = username;
        this.password = password;
    }
    
    public boolean dummyValidation(String name, String username, String password){
        if(name.equals("dummy") && username.equals("dummy") && password.equals("dummy")){
            return true;
        }else{
            return false;
        }
    }

}
