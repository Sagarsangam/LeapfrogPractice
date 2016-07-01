/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.ge.engine;

/**
 *
 * @author Mr. Sagar Sangam Rai
 */
public class GameFactory {

    public static GameCommand get(String key) {
        if (key.contains("move")) {
            return new MoveCommand();
        } else if (key.contains("drop")) {
            return new DropCommand();
        }
        else if (key.contains("exit")) {
            return new ExitCommand();
        }
        return null;

    }
}
