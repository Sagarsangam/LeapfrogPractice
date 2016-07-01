/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.gameEngine;

import com.leapforg.gameEngine.entity.Bag;
import com.leapforg.gameEngine.entity.Player;
import com.leapforg.gameEngine.gEngine.GameCommand;
import com.leapforg.gameEngine.gEngine.GameFactory;
import com.leapforg.gameEngine.gEngine.MoveCommand;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author chira
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
        ArrayList<Bag> itemList = new ArrayList<>();
       try{
        
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
       
        System.out.println("Enter user name ");
        String name = reader.readLine();
        int gold = 200;
        Player player = new Player(name,gold);
        while(true){
            
            System.out.println("Enter Command");
            String[] tokens = reader.readLine().split(" ");
            
            GameCommand gc = GameFactory.get(tokens[0]);
           
           
           
           if(gc!=null){
               gc.execute(player, tokens,itemList);
           }
           else{
               System.out.println("The command you entered is " + tokens[0]);
               System.out.println(tokens[0] + " is an invalid command");
           }
           
        }
        
       }catch(IOException ioe){
           System.out.println(ioe.getMessage());
       }
    
    }
    public static void menu(){
        System.out.println("Welcome to text based Game(Beta Version) ");
        System.out.println("You can us Following commands Move (Back/Forward/Left/Right), Shoot, Drop <item>, Pick <item>, Show Bag, Run, Exit");
        System.out.println("You have been given $200. If you run away from enemy, you loose $200 each time. You need $200 to run away.");
        System.out.println("Always use Move Command unless asked for other commands.(Start with move Command) ");
        System.out.println("Enjoy the game!!");
    }
    
}
