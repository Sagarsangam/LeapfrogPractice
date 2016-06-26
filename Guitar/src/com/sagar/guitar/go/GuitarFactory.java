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
public class GuitarFactory {
     public Guitar get(String key){
       if(key.equalsIgnoreCase("acoustic")){
           return new Acoustic();
       }
       if(key.equalsIgnoreCase("electric")){
           return new Electric();
       }
       
   return null;
   }
}
