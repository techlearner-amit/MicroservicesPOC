package com.techlearner.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.techlearner.user.ValueObject.Department;
import com.techlearner.user.ValueObject.ReponseTemplateValueObject;
import com.techlearner.user.entity.User_Entity;
import com.techlearner.user.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired

	private UserRepository userRepository;
	@Autowired
	private RestTemplate restTemplate;

	
	public User_Entity saveUser(User_Entity user) {
		// TODO Auto-generated method stub
		log.info("Inside User Service :: saveUser Method");
		return userRepository.save(user);
	}
	public ReponseTemplateValueObject getUserWithDepartment(long userId) {
		// TODO Auto-generated method stub
		log.info("Inside User Service :: getUserWithDepartment Method");
		ReponseTemplateValueObject valueObject = new ReponseTemplateValueObject();
		User_Entity user = userRepository.findByUserId(userId);
		System.out.println("===============================");
		System.out.println(user);
		System.out.println("===============================");
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/getDepartment/"+user.getDeptId(), Department.class);
		valueObject.setUser(user);
		valueObject.setDepartment(department);
		return valueObject;
	}

}
