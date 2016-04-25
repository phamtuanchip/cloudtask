package com.cloud.admin.dao;

import com.cloud.admin.model.User;

public interface UserDAO extends DAOInterface<User> {
	User findByUsername(String username);
}
