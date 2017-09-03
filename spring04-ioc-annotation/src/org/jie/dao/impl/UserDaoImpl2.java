package org.jie.dao.impl;

import org.jie.dao.UserDao;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl2 implements UserDao{

	@Override
	public void add() {
		System.out.println("dao2 save add...");
	}

}
