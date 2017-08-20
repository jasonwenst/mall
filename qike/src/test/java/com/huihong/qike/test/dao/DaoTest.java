package com.huihong.qike.test.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huihong.qike.mapper.UserMapper;
import com.huihong.qike.pojo.User;
import com.huihong.qike.pojo.UserExample;
import com.huihong.qike.pojo.UserExample.Criteria;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DaoTest {
	
	@Autowired
	private UserMapper userMapper;
	
	
	@Test
	public void addUser() {
		
		User user = new User();
		user.setCreatetime(new Date());
		user.setLastupdatetime(new Date());
		user.setNickname("妹妹"+System.currentTimeMillis());
		user.setOpenid("fasegwga");
		user.setPicurl("wwww.baidu.com");
		user.setBalance(new BigDecimal(0));
		user.setIntegration(0);
		userMapper.insert(user);
	}
	
	
	
	@Test
	public void pagingUser() {
		
		UserExample example = new UserExample();
		Criteria criteria = example.or();
		criteria.andNicknameLike("妹妹%");
		PageHelper.startPage(1, 2);
		List<User> users = userMapper.selectByExample(example);
		
		PageInfo pageInfo = new PageInfo(users);  
	    Page page = (Page) users; 
	    List<User> userList = page.getResult();
	    System.out.println(page.toString());
		for(User user : userList) {
			System.out.println(user.getNickname());
		}
	}

}
