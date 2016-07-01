/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.ces.controller;

import com.sagar.ces.dao.CourseDAO;
import com.sagar.ces.dao.EnquiryDAO;
import com.sagar.ces.dao.impl.CourseDAOImpl;
import com.sagar.ces.dao.impl.EnquiryDAOImpl;
import java.util.Scanner;

/**
 *
 * @author Mr. Sagar Sangam Rai
 */
public class MainMenuController {

    Scanner in = new Scanner(System.in);

    public void mainMenu() {
        System.out.println("Choose Option: [1-3]: ");
        System.out.println("Type '1' for Course: ");
        System.out.println("Type '2' for Enquiry : ");
        System.out.println("Type '3' for exit : ");
    }

    public void courses() {

        CourseDAO courseDAO = new CourseDAOImpl();
        Scanner input = new Scanner(System.in);
        CourseController courseController = new CourseController(input, courseDAO);

        while (true) {
            courseController.process();
        }
    }
    public void enquiry(){
EnquiryDAO enquiryDAO = new EnquiryDAOImpl();
        Scanner take = new Scanner(System.in);
        EnquiryController enquiryController = new EnquiryController(take, enquiryDAO);

        while (true) {
            enquiryController.process();
        }
    }

    public void processMenu() {
        while(true){
        mainMenu();
        switch (in.nextInt()) {
            case 1:
                courses();
                break;
            case 2:
                enquiry();
                break;
            case 3:
                System.exit(0);
                break;
        } 
        }
    }
}
