/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.ces.controller;

import com.sagar.ces.dao.EnquiryDAO;
import com.sagar.ces.entity.Enquiry;
import java.util.Scanner;

/**
 *
 * @author Mr. Sagar Sangam Rai
 */
public class EnquiryController {

    private EnquiryDAO enquiryDAO;
    Scanner take;
    MainMenuController i = new MainMenuController();

    public EnquiryController(Scanner take, EnquiryDAO enquiryDAO) {
        this.enquiryDAO = enquiryDAO;
        this.take = take;
    }

    public void menu() {
        System.out.println("Choose your Option [1-3]:");
        System.out.println("1.Drop your Enquiry : ");
        System.out.println("2.Show all Enquiries :");
        System.out.println("3.Search your Enquiries : ");
        System.out.println("4.Delete your Enquiry :");
        System.out.println("5.Back to Top Menu : ");

    }

    public void add() {
        while (true) {
            Enquiry enquiry = new Enquiry();
            System.out.println("Make Enquiry ID : ");
            enquiry.setId(take.nextInt());
            System.out.println("Enter Your First Name : ");
            enquiry.setFirstName(take.next());
            System.out.println("Enter Your Last Name : ");
            enquiry.setLastName(take.next());
            System.out.println("Enter Your Email : ");
            enquiry.setEmail(take.next());
            System.out.println("Enter Your Contact Number : ");
            enquiry.setContactNumber(take.next());
           // System.out.println("Enter your Desired Course : " +);
            //enquiry.setCourse(take.next());
            enquiryDAO.insert(enquiry);
            System.out.println("Do you want to add more? [Y/N] : ");
            if (take.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void showAll() {
        enquiryDAO.getAll().forEach(c -> {
            System.out.println(c.toString());
        });
    }

    public void delete() {

        System.out.println("Do you want to delete? Give Enquiry ID : ");
        int id = take.nextInt();
        enquiryDAO.delete(id);
    }

    public void search() {
        System.out.println("Do you want to Search? Give name : ");
        String n = take.next();
        enquiryDAO.search(n);
    }

    public void process() {
        menu();
        switch (take.nextInt()) {
            case 1:
                add();
                break;
            case 2:
                showAll();
                break;
            case 3:
                search();
                break;
            case 4:
                delete();
                break;
            case 5:
                i.processMenu();
                break;
        }
    }
}
