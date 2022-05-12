package com.example.demo.employee.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.employee.entity.User;

@Repository
public interface UserReplository extends JpaRepository<User, Integer>{
	
//	@Query("Select a from User a where a.aitId=?1")
	public User findByAitid(String aitid);
	
	public List<User> findByDob(Date dob);
	
}
