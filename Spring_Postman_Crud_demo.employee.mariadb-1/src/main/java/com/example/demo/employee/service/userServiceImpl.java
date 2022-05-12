package com.example.demo.employee.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.employee.entity.Banner;
import com.example.demo.employee.entity.User;
import com.example.demo.employee.repository.BannerRepository;
import com.example.demo.employee.repository.UserReplository;
import com.example.demo.view.UserView;

@Service
public class userServiceImpl implements UserService {

	@Autowired
	private UserReplository userRepository;

	@Override
	public List<UserView> showAll() {
		List<User> list = null;
		List<UserView> list1 = new ArrayList<>();

		list = userRepository.findAll();
		for (User u : list) {
			list1.add(new UserView(u.getFirstname(), u.getLastname(), u.getDesignation(), u.getAitemail(),
					u.getContactnumber()));
		}
		return list1;
	}

	@Override
	public User findByAitid(String id) {
		
		User user = userRepository.findByAitid(id);
		return user;
	}

//	@Override
//	public List<User> findByDob(Date dob) {
//		
//		return null;
//	}

	@Override
	public List<User> findByDob(Date dob) {
		System.out.println(dob);
		List<User>userBirthdayList=new ArrayList<>();
		List<User>userList=userRepository.findAll();
		System.out.println(userList);
		for(User u:userList) {
			if(u.getDob().equals(dob)) {
				userBirthdayList.add(u);
			}
		}
		return userBirthdayList;
	}

	
	
}
