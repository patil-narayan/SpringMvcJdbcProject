package com.technoelevate.empdata.controller.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Employee {
	private int EmpId;
	private String EmpName;
	private String EmpPassword;
	

}
