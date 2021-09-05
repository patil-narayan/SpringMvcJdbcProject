package com.technoelevate.empdata.controller.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import com.technoelevate.empdata.controller.dto.Employee;

public interface EmployeeJdbc {
	
	public int addEmployee(Employee emp);
    public int updateEmployee(Employee emp); 
    public int deleteEmployee(int id); 
    public Employee authenticate(int id,String password);
	 public Employee getEmployee(int id);
	 public List<Employee> getAllEmployee();
	 

}
