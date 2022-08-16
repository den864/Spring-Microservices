package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	List<User> list=List.of(
			new User(12L,"ac","3434344343"),
			new User(13L,"dwd","44343"),
			new User(11L,"frgrg","3343")
			);
	
	@Override
	public User getUser(Long id) {
		
		return this.list.stream().filter(e->e.getUserId().equals(id)).findAny().orElse(null);
	}

}
