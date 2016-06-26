/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.guitar;

import com.sagar.guitar.go.Guitar;
import com.sagar.guitar.go.GuitarFactory;

/**
 *
 * @author Mr. Sagar Sangam Rai
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GuitarFactory gf= new GuitarFactory();
        Guitar m=gf.get("acoustic");
        
        Guitar h=gf.get("electric");
        h.setModel("RK-3");
        h.setName("Rocking");
        System.out.println(h.getModel());
        System.out.println(h.getName());
        h.GuitarDescription();
    }
    
}
