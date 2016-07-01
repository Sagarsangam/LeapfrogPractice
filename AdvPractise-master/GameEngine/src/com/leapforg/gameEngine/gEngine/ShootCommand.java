/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.gameEngine.gEngine;

import com.leapforg.gameEngine.entity.Bag;
import com.leapforg.gameEngine.entity.Player;
import java.util.ArrayList;

/**
 *
 * @author chira
 */
public class ShootCommand extends GameCommand {

    @Override
    public void execute(Player player, String[] tokens, ArrayList<Bag> itemList) {
        int checkGun = 0;
        for(Bag bag: itemList){
            if(bag.getItem().equalsIgnoreCase("gun")){
                checkGun = 1;
            }
        }
        if(checkGun==1){
            System.out.println(player.getUserName() + " Killed Enemy and Earned $500 ");
            int goldTemp = player.getGold();
            player.setGold((goldTemp+500));
        }else{
            System.out.println("No Gun to shoot with." + player.getUserName() + " is killed by Enemy. Game Over. Thank you for Playing ");
            System.exit(0);
        }
        
    }
    
}
