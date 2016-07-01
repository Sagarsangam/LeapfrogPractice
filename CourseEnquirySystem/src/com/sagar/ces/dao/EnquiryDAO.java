/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.ces.dao;

import com.sagar.ces.entity.Enquiry;
import java.util.List;

/**
 *
 * @author Mr. Sagar Sangam Rai
 */
public interface EnquiryDAO {
    boolean insert(Enquiry e);
    boolean delete(int id);
    Enquiry getById(int id);
    List<Enquiry> getAll();
    List<Enquiry> search(String param);

}
