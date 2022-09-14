package com.nidservices.yekoregistration.service;

import org.springframework.stereotype.Service;
import com.nidservices.yekoregistration.model.User;
import com.nidservices.yekoregistration.registry.AdapterService;

@Service("seller")
public class SellerUser implements AdapterService<User>{

	@Override
	public void process(User request) {
		System.out.println("This is seller user registration - "  + request.toString());
		
	}
}