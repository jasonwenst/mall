package com.huihong.qike.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huihong.qike.mapper.UserMapper;
import com.huihong.qike.pojo.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void addUser(User user) {
		userMapper.insert(user);
	}

}
