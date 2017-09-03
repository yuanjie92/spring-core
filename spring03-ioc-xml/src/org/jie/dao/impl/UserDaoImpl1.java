package org.jie.dao.impl;

import org.jie.dao.UserDao;

public class UserDaoImpl1 implements UserDao{

	@Override
	public void add() {
		System.out.println("dao1 save add...");
	}

}
