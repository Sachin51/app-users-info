package com.example.demoproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoproject.model.AppUser;
import com.example.demoproject.repository.AppUserRepository;

@Service
public class AppUserService {

	@Autowired
	AppUserRepository appUserRepo;

	public AppUser addUser(AppUser appUser) {
		return appUserRepo.save(appUser);
	}

	public List<AppUser> getAllAppUsers() {
		return appUserRepo.findAll();
	}
}
