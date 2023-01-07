/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author Raiza Rahman
 */
public class userClient extends user{
    int freelancerNumber, packageNumber;
    
    public userClient(String name, String username, String password){
        super(name, username, password);
    }
    
    public void clientOrder(int freelancerNumber, int packageNumber){
        this.freelancerNumber = freelancerNumber;
        this.packageNumber = packageNumber;
    }
    
    void viewOrder(){
        // ??????
    }
}
