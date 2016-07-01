/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.gameEngine.gEngine;

import com.leapforg.gameEngine.entity.Bag;
import com.leapforg.gameEngine.entity.Player;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chira
 */
public abstract class GameCommand {
    protected String[] items = new String[]{"Gun","Diamond","Pencil","enemy","Rock","Toy","Gold"};
    Scanner input = new Scanner(System.in);
    public abstract void execute(Player player, String[] tokens,ArrayList<Bag> itemList);
    
    
}
