/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.ge.engine;

import com.sagar.ge.entity.Player;

/**
 *
 * @author Mr. Sagar Sangam Rai
 */
public class ExitCommand extends GameCommand {

    @Override
    public void execute(Player player, String cmd) {
        System.exit(0);    }
    
}
