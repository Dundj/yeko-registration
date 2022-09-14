package com.nidservices.yekoregistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nidservices.yekoregistration.model.User;
import com.nidservices.yekoregistration.registry.ServiceRegistry;


@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private ServiceRegistry serviceRegistry;
	
    @PostMapping
	public void processStudentDetails(@RequestBody User user) {
		serviceRegistry.getService(user.getUserType()).process(user);
	}

	
}
