/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.GunTypes.bo;

/**
 *
 * @author Mr. Sagar Sangam Rai
 */
public class GunFactory {
   public Gun get(String key){
       if(key.equalsIgnoreCase("Mig")){
           return new MilitaryGun();
       }
       if(key.equalsIgnoreCase("Hdg")){
           return new MilitaryGun();
       }
       if(key.equalsIgnoreCase("Hug")){
           return new MilitaryGun();
       }
   return null;
   }
   
    
}
