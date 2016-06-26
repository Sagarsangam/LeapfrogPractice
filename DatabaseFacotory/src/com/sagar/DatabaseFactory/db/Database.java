/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.DatabaseFactory.db;

/**
 *
 * @author Mr. Sagar Sangam Rai
 */
public abstract class Database {
    public abstract void connect();
    public abstract  void Insert();
    public abstract void Retrive();
    public abstract void Update();
    public abstract void Delete();
     
}
