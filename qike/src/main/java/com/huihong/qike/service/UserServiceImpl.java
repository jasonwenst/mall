package com.huihong.qike.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.huihong.qike.mapper.UserMapper;
import com.huihong.qike.pojo.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void addUser(User user) {
		userMapper.insert(user);
	}

}
