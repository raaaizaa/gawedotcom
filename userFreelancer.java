package com.mycompany.oop;

/**
 *
 * @author Raiza Rahman
 */
public class userFreelancer extends user{
    private int type;

    public userFreelancer(String name, String username, String password, int type){
        super(name, username, password);
        this.type = type;
    }
    
    public boolean dummyFreelancerValidation(String name, String username, String password, int type){
        if(name.equals("dummy") && username.equals("dummy") && password.equals("dummy") && type <= 4){
            return true;
        }else{
            return false;
        }    
    }
}