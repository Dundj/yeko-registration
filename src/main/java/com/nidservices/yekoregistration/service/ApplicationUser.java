package com.nidservices.yekoregistration.service;

import org.springframework.stereotype.Service;
import com.nidservices.yekoregistration.model.User;
import com.nidservices.yekoregistration.registry.AdapterService;

import com.nidservices.yekoregistration.model.User;


@Service("application")
public class ApplicationUser implements AdapterService<User>{

	@Override
	public void process(User request) {
		System.out.println("This is application user registration - "  + request.toString());
		
	}
}
