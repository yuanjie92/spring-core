package org.jie.service;

import javax.annotation.Resource;

import org.jie.dao.UserDao;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	@Resource(name="userDaoImpl2")
	private UserDao userDao;

	public void add() {
		userDao.add();
	}
}
