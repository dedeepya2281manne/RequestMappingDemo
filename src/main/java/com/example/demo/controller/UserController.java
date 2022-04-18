package com.example.demo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

	Map<String,User> allUsers = new HashMap<>();
	
	@GetMapping
	public Collection<User> getMapping() {
		return allUsers.values();
	}
	@PostMapping
	public String postMapping(@RequestBody User userDetails) {
		allUsers.put(userDetails.getUserId(), userDetails);
		return "Post: User added";
	}
	@PutMapping(path="/{userId}")
	public String putMapping(@PathVariable String userId,@RequestBody User user) {
		if(allUsers.containsKey(userId)) {
			allUsers.remove(userId);
			allUsers.put(userId, user);
			return "User Modified";
		}
		return "User not found. Hence not Modified";
	}
	@DeleteMapping(path="/{userId}")
	public String deleteMapping(@PathVariable String userId) {
		if(allUsers.containsKey(userId)) {
			allUsers.remove(userId);
			return "User deleted successfully";
		}
		return "userId not found";
	}
}
