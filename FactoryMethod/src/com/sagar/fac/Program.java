/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.fac;
import com.sagar.fac.bo.Pen; 
//import com.sagar.fac.bo.BallPen;
//import com.sagar.fac.bo.FountainPen;
import com.sagar.fac.bo.PenFactory;
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
       PenFactory pf =new PenFactory();
       
        Pen p=pf.get("bp");
        p.setName("Pro-23");
        p.setModel("23-HR");
        System.out.println(p.getName());
        System.out.println(p.getModel());
        p.write();
        
        /*Pen m=new FountainPen();
        m.setName("Techno Magic");
        m.setModel("Hr-33");
        System.out.println(m.getName());
        System.out.println(m.getModel());
        m.write();
        */
        
        
    }
    
}
