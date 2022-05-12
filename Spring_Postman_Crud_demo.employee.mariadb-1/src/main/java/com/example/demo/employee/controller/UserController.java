package com.example.demo.employee.controller;
import java.sql.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;S
import com.example.demo.employee.entity.User;
import com.example.demo.employee.service.UserService;
import com.example.demo.view.UserView;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	/* to get all Employee method */
	@GetMapping("/getEmployees")
	public ResponseEntity<List<UserView>> getAll() {
		try {
			List<UserView> list = userService.showAll();
			return ResponseEntity.of(Optional.of(list));
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

	@GetMapping("/getEmployee/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") String id) {
		
		try {
		User user = userService.findByAitid(id);
		return ResponseEntity.of(Optional.of(user));
		}
		catch (Exception e) 
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
	}
	
	@GetMapping("getBirthday/{dob}")
	public List<User> getBirthDate(@PathVariable("dob") Date date){
		List<User> userBirthDayList=userService.findByDob(date);
		return userBirthDayList;
	}
}
