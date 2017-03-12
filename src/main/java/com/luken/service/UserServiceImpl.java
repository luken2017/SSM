package com.luken.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.luken.dao.UserDao;
import com.luken.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Resource
    UserDao userDao;
	
    @Override
	public User findUserById(int id) {
		return this.userDao.findUserById(id);
	}
	
	@Override
	public List<User> findUserList() {
		return this.userDao.findUserList();
	}

	@Override
	public int addUser(User user) {
		return this.userDao.addUser(user);
	}

	@Override
	public int updateUser(User user) {
		return this.userDao.updateUser(user);
	}

	@Override
	public int delUser(int id) {
		// TODO Auto-generated method stub
		return this.userDao.delUser(id);
	}


}
