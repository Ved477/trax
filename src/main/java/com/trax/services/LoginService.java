package com.trax.services;

import com.trax.entities.User;

public interface LoginService {

	public void saveUser(User user);

	public User findByEmail(String email);
}
