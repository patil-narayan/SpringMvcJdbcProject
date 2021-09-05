package com.technoelevate.empdata.controller.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.technoelevate.empdata.controller.dto.Employee;
@Component
public class EmployeeJdbcImp implements EmployeeJdbc{
	
	JdbcTemplate template;
	@Autowired
	Employee emp;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int addEmployee(Employee emp) {
		String query="insert into emp_data values(?,?,?)";
		int add = template.update(query,emp.getEmpId(),emp.getEmpName(),emp.getEmpPassword());
		return add;
	}

	@Override
	public int updateEmployee(Employee emp) {
		String query = "Update emp_data set EmpName=? Where EmpId=? ";
		int up = template.update(query,emp.getEmpId(),emp.getEmpName(),emp.getEmpPassword());
		return up;
	}

	@Override
	public int deleteEmployee(int id) {
		String query = "delete from emp_data where id=?";
		int delete = template.update(query,emp.getEmpId());
		return delete;
	}

	@Override
	public Employee authenticate(int id, String password) {
		RowMapper<Employee> row = new RowMapperimpl();
		String query="Select from emp_data where EmpId=?";
		Employee emp = template.queryForObject(query, row,id);
		return emp;
	}

	@Override
	public Employee getEmployee(int id) {
		RowMapper<Employee> row = new RowMapperimpl();
		String query="Select from emp_data where id=?";
		Employee emp = template.queryForObject(query, row,id);
		return emp;
		
	}

	@Override
	public List<Employee> getAllEmployee() {
			RowMapper<Employee> row = new RowMapperimpl();
			String query="Select from emp_data";
			List<Employee> emp = template.query(query, row);
			return emp;
		
	}


}
