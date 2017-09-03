package org.jie.dao.impl;

import org.jie.dao.UserDao;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao{

	@Override
	public void add() {
		System.out.println("dao save add...");
	}

}
