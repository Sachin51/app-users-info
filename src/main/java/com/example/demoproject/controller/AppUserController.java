package com.example.demoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoproject.model.AppUser;
import com.example.demoproject.service.AppUserService;

@RestController
@RequestMapping("/appUser")
public class AppUserController {

	@Autowired
	AppUserService appUserService;

	@RequestMapping("/addUser")
	public AppUser addUser(@RequestBody AppUser appUser) {
		return appUserService.addUser(appUser);
	}

	@RequestMapping("/getAllAppUsers")
	public List<AppUser> getAllAppUsers() {
		return appUserService.getAllAppUsers();
	}
}
