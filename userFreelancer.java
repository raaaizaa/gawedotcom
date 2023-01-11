/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
}
