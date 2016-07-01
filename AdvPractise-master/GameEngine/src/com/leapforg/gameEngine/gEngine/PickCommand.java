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
public class PickCommand extends GameCommand {

    @Override
    public void execute(Player player, String[] tokens, ArrayList<Bag> itemList) {
        if (tokens.length == 2) {
            if ((itemList.size()) <= 2) {
                Bag bag = new Bag();
                bag.setItem(tokens[1]);
                itemList.add(bag);
                System.out.println(tokens[1] + " added to bag");

            } else {
                System.out.println("Bag Full. Please Try Dropping Items");
            }

        } else {
            System.out.println("Error: Partial Command Entry. Please Try Again");
        }
    }
}