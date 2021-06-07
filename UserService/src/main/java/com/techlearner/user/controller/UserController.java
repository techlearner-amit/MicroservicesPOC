package com.techlearner.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techlearner.user.ValueObject.ReponseTemplateValueObject;
import com.techlearner.user.entity.User_Entity;
import com.techlearner.user.service.UserService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
	@Autowired
	private UserService userService;
	

	@PostMapping("/saveUser")
	public User_Entity saveUser(@RequestBody User_Entity user) {
		log.info("Inside User Controller :: saveUser Method");
		return userService.saveUser(user);
	}

	@GetMapping("/getUserWithDepartment/{userId}")
	public ReponseTemplateValueObject getUserWithDepartment(@PathVariable("userId") long userId) {
		log.info("Inside User Controller :: getUserWithDepartment Method");
		return userService.getUserWithDepartment(userId);
	}

}
