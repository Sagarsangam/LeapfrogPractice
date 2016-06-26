/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.DatabaseFactory.db;

/**
 *
 * @author Mr. Sagar Sangam Rai
 */
public class Dbfactory {
     public Database get(String key){
       if(key.equalsIgnoreCase("my")){
           return new Mysql();
       }
       if(key.equalsIgnoreCase("sq")){
           return new Sqlite();
       }
       
   return null;
   }
}
