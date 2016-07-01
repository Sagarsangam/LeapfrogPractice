/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.ces.dao;

import com.sagar.ces.entity.Course;
import java.util.List;

/**
 *
 * @author Mr. Sagar Sangam Rai
 */
public interface CourseDAO {
    boolean insert(Course c);
    boolean delete(int id);
    Course getById(int id);
    List<Course> getAll();
    List<Course> search(String n);
}
