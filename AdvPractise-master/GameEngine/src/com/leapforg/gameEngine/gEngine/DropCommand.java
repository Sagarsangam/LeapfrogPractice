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
 * @author chirag
 */
public class DropCommand extends GameCommand {

    @Override
    public void execute(Player player, String[] tokens, ArrayList<Bag> itemList) {
      int check = 0;
        for (Bag b : itemList) {

            if (tokens[1].equalsIgnoreCase(b.getItem())) {
                System.out.println(tokens[1] + " Dropped");
                itemList.remove(b);
                check = 1;
            } 
        }
        if(check!=1){
            System.out.println("Item Not Found");
        }

    }

}
