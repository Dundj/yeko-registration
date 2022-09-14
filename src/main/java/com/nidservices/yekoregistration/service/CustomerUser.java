package com.nidservices.yekoregistration.service;

import org.springframework.stereotype.Service;
import com.nidservices.yekoregistration.model.User;
import com.nidservices.yekoregistration.registry.AdapterService;

@Service("customer")
public class CustomerUser implements AdapterService<User>{

	@Override
	public void process(User request) {
		System.out.println("This is customer user registration - "  + request.toString());
		
	}
}