package com.huihong.qike.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huihong.qike.pojo.User;
import com.huihong.qike.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/add")
	public void addUser(@RequestBody User user) {
		
		userService.addUser(user);
		
	}

}
