package com.example.springboot02.service;

import com.example.springboot02.dto.User;

import java.util.List;

public interface UserService {
	public List<User> getUsers();
	public User findUserById(int id);
	public boolean updateUserById(User user);
	public boolean insertUser(User user);
	public boolean deleteById(int id);
}
