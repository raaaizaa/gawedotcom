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
    
    // Validasi dummy account
    public boolean dummyValidation(String name, String username, String password){
        if(name.equals("dummy") && username.equals("dummy") && password.equals("dummy")){
            return true;
        }else{
            return false;
        }
    }

}
