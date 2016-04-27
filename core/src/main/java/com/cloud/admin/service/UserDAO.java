package com.cloud.admin.service;

import com.cloud.admin.dao.DAOInterface;
import com.cloud.admin.model.User;

public interface UserDAO extends DAOInterface<User> {
	User findByUsername(String username);
}
