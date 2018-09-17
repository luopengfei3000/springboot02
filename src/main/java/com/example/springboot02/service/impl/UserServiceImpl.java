package com.example.springboot02.service.impl;

import java.util.List;

import com.example.springboot02.dao.UserDao;
import com.example.springboot02.dto.User;
import com.example.springboot02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userDao.findAllUser();
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return userDao.findUserById(id);
	}

	@Override
	public boolean updateUserById(User user) {
		// TODO Auto-generated method stub
		userDao.updateUserById(user);
		return true;
	}

	@Override
	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		userDao.insertUser(user);
		return true;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		userDao.deleteById(id);
		return true;
	}

}
