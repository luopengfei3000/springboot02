package com.example.springboot02.dao;

import java.util.List;

import com.example.springboot02.dto.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
	public List<User> findAllUser();
	public User findUserById(int id);
	public boolean updateUserById(User user);
	public boolean insertUser(User user);
	public boolean deleteById(int id);
}
