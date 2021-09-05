package com.technoelevate.empdata.controller.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;

import com.technoelevate.empdata.controller.dto.Employee;

public class RowMapperimpl implements org.springframework.jdbc.core.RowMapper<Employee>{

	@Autowired
	Employee emp;
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		emp.setEmpId(rs.getInt(1));
		emp.setEmpName(rs.getString(2));
		emp.setEmpPassword(rs.getString(3));
		return emp;
	}
	
}
