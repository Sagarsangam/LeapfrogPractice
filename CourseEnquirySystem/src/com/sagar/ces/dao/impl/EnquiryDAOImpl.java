/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagar.ces.dao.impl;

import com.sagar.ces.dao.EnquiryDAO;
import com.sagar.ces.entity.Enquiry;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Mr. Sagar Sangam Rai
 */
public class EnquiryDAOImpl implements EnquiryDAO{
        private List<Enquiry>enquiryList=new ArrayList<>();

    @Override
    public boolean insert(Enquiry e) {
      return enquiryList.add(e);
    }

    @Override
    public boolean delete(int id) {
      Enquiry e=getById(id);
     if(e!=null){
         enquiryList.remove(e);
     }
     return false;    
    }

    @Override
    public Enquiry getById(int id) {
      for(Enquiry e:enquiryList){
        if(e.getId()==id){
            return e;
        }
      }
    return null;
    }

    @Override
    public List<Enquiry> getAll() {
      return enquiryList;
    }

    @Override
    public List<Enquiry> search(String n) {
List<Enquiry> filterList = new ArrayList<>();
        for (Enquiry e : enquiryList) {
            if (e.getFirstName().contains(n)||e.getLastName().contains(n)||e.getEmail().contains(n)||e.getContactNumber().contains(n)) {
                filterList.add(e);
                System.out.println(filterList);

            }
        }
        return filterList;    }

   
}
