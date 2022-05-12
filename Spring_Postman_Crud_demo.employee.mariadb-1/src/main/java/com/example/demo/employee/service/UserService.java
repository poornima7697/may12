package com.example.demo.employee.service;

import java.sql.Date;
import java.util.List;

import com.example.demo.employee.entity.User;
import com.example.demo.view.UserView;

public interface UserService {
	
	public List<UserView>showAll();
	
    public User findByAitid(String id);
   
    public List<User> findByDob(Date dob);
    
}