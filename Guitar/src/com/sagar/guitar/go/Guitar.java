/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.guitar.go;

/**
 *
 * @author Mr. Sagar Sangam Rai
 */
public abstract class  Guitar {
    private String name;
    private String model;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
       this.model=model; 
    }
    public abstract void  GuitarDescription();
}

