package com.techlearner.user.ValueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	private long deptId;	

	private String deptName;

	private String deptAddress;

	private String deptCode;
}
