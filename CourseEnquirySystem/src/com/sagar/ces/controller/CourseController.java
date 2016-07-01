/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.ces.controller;

import com.sagar.ces.dao.CourseDAO;
import com.sagar.ces.dao.impl.CourseDAOImpl;
import com.sagar.ces.entity.Course;
import java.util.Scanner;

/**
 *
 * @author Mr. Sagar Sangam Rai
 */
public class CourseController {
    private CourseDAO courseDAO;
    Scanner input;
    MainMenuController i=new MainMenuController();
    
    public CourseController(Scanner input,CourseDAO courseDAO) {
        this.input=input;
        this.courseDAO=courseDAO;
    }
    public void menu(){
        System.out.println("Choose your Option [1-5]:");
        System.out.println("1.Add Course : ");
        System.out.println("2.Delete Course :");
        System.out.println("3.Search by ID :");
        System.out.println("4.Show All Course : ");
        System.out.println("5.Back to Top menu,");
    }
    public void add(){
        while(true){
        Course course=new Course();
        System.out.println("Enter course ID : ");
        course.setId(input.nextInt());
        System.out.println("Enter course Name : ");
        course.setName(input.next());
        System.out.println("Write Course Description : ");
        course.setDescription(input.next());
        courseDAO.insert(course);
            System.out.println("Do you want to add more? [Y/N] : ");
        if(input.next().equalsIgnoreCase("n")){
            break;
        }
        }
    }
    public void showAll(){
        courseDAO.getAll().forEach(c->{
            System.out.println(c.toString());
        });
    }
    
    public void delete(){
        
        System.out.println("Do you want to delete? Give ID : ");
        int id=input.nextInt();
        courseDAO.delete(id);
    }
    public void search(){
        System.out.println("Do you want to Search? Give name : ");
        String n=input.next();
        courseDAO.search(n);
    }
    public void process(){
        menu();
        switch (input.nextInt()) {
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    showAll();
                    break;
                case 5:
                    i.processMenu();
                    break;
            }
    }
}
