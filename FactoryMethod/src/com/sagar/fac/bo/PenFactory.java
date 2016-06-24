/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.fac.bo;

/**
 *
 * @author Mr. Sagar Sangam Rai
 */
public class PenFactory {
    public Pen get(String key){
        if(key.equalsIgnoreCase("bp")){
            return new BallPen();
        }
        if(key.equalsIgnoreCase("fp")){
            return new FountainPen();
        }
        return null;
    }
}
