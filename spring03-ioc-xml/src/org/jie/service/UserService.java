package org.jie.service;

import org.jie.dao.UserDao;

public class UserService {

	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void add() {
		userDao.add();
	}
}
