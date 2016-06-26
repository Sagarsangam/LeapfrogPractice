/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.GunTypes;

import com.sagar.GunTypes.bo.Gun;
import com.sagar.GunTypes.bo.GunFactory;

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
        GunFactory gf= new GunFactory();
        Gun m=gf.get("Mig");
        
        Gun h=gf.get("Hdg");
        h.setModel("RK-3");
        h.setName("Pestol");
        System.out.println(h.getModel());
        System.out.println(h.getName());
        h.firingDescription();
        
    }
    
}
