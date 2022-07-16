package com.trax.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trax.entities.User;
import com.trax.repositories.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepo;
	
	@Override
	public void saveUser(User user) {
		loginRepo.save(user);
	}

	@Override
	public User findByEmail(String email) {
		User user = loginRepo.findByEmail(email);
		return user;
	}

}
