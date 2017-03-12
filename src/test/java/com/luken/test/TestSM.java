package com.luken.test;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.luken.model.User;
import com.luken.service.UserService;

@ContextConfiguration(locations = { "classpath:conf/spring/spring-context.xml",
		"classpath:conf/spring/spring-datasource.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSM {
	private static Logger logger = LoggerFactory.getLogger(TestSM.class);

	@Autowired
	UserService userService;

	@org.junit.Test
	public void test() {
		User user = userService.findUserById(1);
		logger.info("用户：{}", user);
	}
}
