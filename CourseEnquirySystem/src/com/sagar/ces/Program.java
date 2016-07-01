/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.ces;

import com.sagar.ces.controller.CourseController;
import com.sagar.ces.controller.MainMenuController;
import com.sagar.ces.dao.CourseDAO;
import com.sagar.ces.dao.impl.CourseDAOImpl;
import com.sagar.ces.entity.Enquiry;
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
      MainMenuController i=new MainMenuController();
      i.processMenu();
    }
}
