/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.course.dao;

import java.util.List;

/**
 *
 * @author Mr. Sagar Sangam Rai
 */
public interface CourseDAO {
    
    boolean  insert(CourseDAO C);
    boolean  delete(int id);
    boolean searchById(int id);
    CourseDAO getById(int id);
    List<Course>getAll();     
    List<Course>search(String param);
}
 
    
