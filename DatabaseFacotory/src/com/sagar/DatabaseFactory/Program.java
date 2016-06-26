/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.DatabaseFactory;

import com.sagar.DatabaseFactory.db.Database;
import com.sagar.DatabaseFactory.db.Dbfactory;

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
        Dbfactory df= new Dbfactory();
        //Database m=df.get("my");
        
        Database h=df.get("sq");
        h.connect();
       // m.connect();
        
    }
    
}
