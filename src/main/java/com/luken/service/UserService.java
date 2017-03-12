package com.luken.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.luken.model.User;

public interface UserService {

	public User findUserById(int id);

	public List<User> findUserList();

	public int addUser(User user);

	public int updateUser(User user);

	public int delUser(@Param("id") int id);
}
