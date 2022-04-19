package com.tehtava.openshift.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tehtava.openshift.models.Company;
import com.tehtava.openshift.models.User;
import com.tehtava.openshift.repositories.CompanyRepository;
import com.tehtava.openshift.repositories.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable Long id) {
		return userRepository.findById(id).get();
	}
	
	@PostMapping("/users")
	public User addNewUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	
}
