package com.luken.web.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.luken.model.User;
import com.luken.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Resource
    private UserService userService;

    @RequestMapping("/findUserById")
    public User findUserById(HttpSession session,@RequestParam int id ){
        User user = this.userService.findUserById(id);
        return user;
    }

	@RequestMapping(path = {"findUserList"}, method = {RequestMethod.GET})
	public List<User> findUserList() {
		return this.userService.findUserList();
	}
	
	@RequestMapping(path = {"addUser"}, method = {RequestMethod.GET})
	public String addUser(HttpSession session, @RequestParam String name, @RequestParam String password,
			@RequestParam int age) {
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		user.setAge(age);
		int retResult = this.userService.addUser(user);
		
		String result = " add success";
		if(retResult == 0) {
			result = "fail";
		}
		return result;
	}
}
