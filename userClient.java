/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

import java.util.ArrayList;

/**
 *
 * @author Raiza Rahman
 */
public class userClient extends user{
    public ArrayList <order> orderList = new ArrayList <order>();
    int freelancerCategory, freelancerNumber, packageNumber;
    
    public userClient(String name, String username, String password){
        super(name, username, password);
    }
    
    public void clientOrder(int freelancerCategory, int freelancerNumber, int packageNumber){
        this.freelancerCategory = freelancerCategory;
        this.freelancerNumber = freelancerNumber;
        this.packageNumber = packageNumber;
    }
    
    void viewOrder(){
        
    }
}
