package com.luken.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.luken.model.User;

public interface UserDao {

	public User findUserById(@Param("id") int id);

	public List<User> findUserList();

	public int addUser(User user);

	public int updateUser(User user);

	public int delUser(@Param("id") int id);

}
