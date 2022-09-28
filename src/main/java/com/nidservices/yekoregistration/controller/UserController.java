package com.nidservices.yekoregistration.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.nidservices.yekoregistration.model.User;
import com.nidservices.yekoregistration.registry.ServiceRegistry;


@RestController
public class UserController {
	@Autowired
	private ServiceRegistry serviceRegistry;
	
    @PostMapping("user")
	public void processStudentDetails(@RequestBody User user) {
		serviceRegistry.getService(user.getUserType()).addUserByType(user);
		System.out.println(user);
	}
    
    @GetMapping("users/{userType}")
   	public List<User> retreivingAllUsers(@PathVariable("userType") String user) {
   		return serviceRegistry.getService(user).findAllUser();
   	}
    
    @GetMapping("user/{userType}")
   	public Optional<User> retreivingSingleUser(@PathVariable("userType") String user, @RequestHeader UUID id) {
   		return serviceRegistry.getService(user).selectUserById(id);
    }
   	
    @PutMapping("user")
   	public int updateUserById(@RequestBody User user) {
   		return serviceRegistry.getService(user.getUserType()).updateUserById(user.getId(), user);
   	}
    
    @DeleteMapping("/deleting/users/{userType}")
   	public int deleteUserById(@PathVariable("userType") String user, @RequestHeader UUID id) {
   		return serviceRegistry.getService(user).deleteUserById(id);
   	}
	
}
