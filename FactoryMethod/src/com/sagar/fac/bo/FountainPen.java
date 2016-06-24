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
public class FountainPen extends Pen {

    @Override
    public void write() {
        System.out.println("This is Fountain pen "+getName()+" and writing very well");
    }
    
}
