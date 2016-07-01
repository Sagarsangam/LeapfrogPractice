/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.course.impl;

import com.sagar.course.dao.CourseDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mr. Sagar Sangam Rai
 */
public class CourseDAOImple implements CourseDAO{
    private List<CourseDAO> courseList=new ArrayList<>();
    @Override
    public boolean insert(CourseDAO C) {
       return courseList.add(C);
    }

    @Override
    public boolean delete(int id) {
    CourseDAO C=getById(id);
        }

   

    @Override
    public List<CourseDAO> getAll() {
    return courseList;
    }

    @Override
    public List<CourseDAO> search(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean searchById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CourseDAO getById(int id) {
     for(CourseDAO c:courseList){
         if(c.ge==id){
             
         }
     } 
        }

    
    
}
