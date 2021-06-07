package com.techlearner.department.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlearner.department.entity.Department;
import com.techlearner.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;




@Service
@Slf4j
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		log.info("Inside Department Service :: saveDepartment Method");

		return departmentRepository.save(department);
	}

	public Department getDepartmentByDeptId(long deptId) {
		// TODO Auto-generated method stub
		log.info("Inside Department Service :: getDepartmentByDeptId Method");

		return departmentRepository.findByDeptId(deptId);
	}


}
