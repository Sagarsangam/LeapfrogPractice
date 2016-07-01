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
public class RunCommand extends GameCommand{

    @Override
    public void execute(Player player, String[] tokens, ArrayList<Bag> itemList) {
        int goldTemp=player.getGold();
        if(goldTemp>=200){
        System.out.println(player.getUserName()+ " ran Away and Lost 200 Gold");
        player.setGold((goldTemp-200));
        }else{
            System.out.println("Money not sufficient for run. Game Over. Thank you for Playing");
            System.exit(0);
        }
        
    }
    
}
