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
public class ShowCommand extends GameCommand {

    @Override
    public void execute(Player player, String[] tokens, ArrayList<Bag> itemList) {
        System.out.println("Your Bag Contains Following Objects");
        int i = 0;
        for(Bag bag: itemList){
            i = i + 1;
            System.out.println(i+bag.getItem());
        }
        System.out.println("Gold : " + player.getGold());
    }
    
    
}
