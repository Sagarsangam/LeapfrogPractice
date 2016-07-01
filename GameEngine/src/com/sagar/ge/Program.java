/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.ge;

import com.sagar.ge.engine.DropCommand;
import com.sagar.ge.engine.GameCommand;
import com.sagar.ge.engine.GameFactory;
import com.sagar.ge.engine.MoveCommand;
import com.sagar.ge.entity.Player;
import java.util.Scanner;

/**
 *
 * @author Mr. Sagar Sangam Rai
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
        System.out.println("Enter the name of the player : ");
        String name=input.next();
        Player player=new Player(name);
        String cmd="";
        while(true){
            GameCommand gc=GameFactory.get(input.nextLine());
            if(gc!=null){
                gc.execute(player, cmd);
            }
            else{
            System.out.println("the command is : "+cmd);
                System.out.println("Invalid Command");
            }
        }
        
        
   }
    
}
