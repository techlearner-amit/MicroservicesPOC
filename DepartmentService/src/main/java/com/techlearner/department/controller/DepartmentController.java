package com.techlearner.department.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techlearner.department.entity.Department;
import com.techlearner.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	

	@PostMapping("/saveDepartment")
	public Department saveDepartment(@RequestBody Department department) {

		log.info("Inside Department Controller :: saveDepartment Method");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/getDepartment/{deptId}")
	public Department getDepartmentByDeptId(@PathVariable("deptId") long deptId) {
		System.out.println("=============================================");
		System.out.println(deptId);
		System.out.println("=============================================");
		log.info("Inside Department Controller :: getDepartmentByDeptId Method");
		return departmentService.getDepartmentByDeptId(deptId);
	}
}
