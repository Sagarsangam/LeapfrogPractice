/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.ge.entity;

/**
 *
 * @author Mr. Sagar Sangam Rai
 */
public class Player {
    
    private String name;
    
    public Player(){
        
    }
    public Player(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
