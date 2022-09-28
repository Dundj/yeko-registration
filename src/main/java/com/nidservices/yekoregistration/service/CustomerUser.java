package com.nidservices.yekoregistration.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;
import com.nidservices.yekoregistration.model.User;
import com.nidservices.yekoregistration.registry.AdapterService;

@Service("customer")
public class CustomerUser implements AdapterService<User>{
	public static List<User> DB = new ArrayList<>();
	@Override
	public User addUserByType(User request) {
		System.out.println("This is customer user registration - "  + request.toString());
		UUID id = UUID.randomUUID();
		DB.add(new User(id, request.getUserIdentifier(), request.getUserType(), request.getUserName()));
		
		return request;		
	}
	
	@Override
	public List<User> findAllUser() {
		return DB;
	}

	@Override
	public int updateUserById(UUID id, User user) {
		
		return selectUserById(id)
				.map(p -> {
					int indexOfuserToUpdate = DB.indexOf(p);
					if (indexOfuserToUpdate>= 0) {
						DB.set(indexOfuserToUpdate, new User(id, user.getUserIdentifier(),  user.getUserType(), user.getUserName()));
						return 1;
					}
					return 0;
				
				})
				.orElse(0);
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Override
	public Optional<User> selectUserById(UUID id) {
		return DB.stream()
				.filter(user -> String.valueOf(user.getId()).equals(id))
				.findFirst();
	}

	@Override
	public int deleteUserById(UUID id) {
		Optional<User> userMaybe = selectUserById(id);
		if (userMaybe.isEmpty()) {
			return 0;
		}
		DB.remove(userMaybe.get());
		return 1;
	
}
	}