package com.technoelevate.empdata.controller.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.technoelevate.empdata.controller.dao.EmployeeJdbcImp;
import com.technoelevate.empdata.controller.dto.Employee;

@Component
public class AppService {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/technoelevate/empdata/controller/dao/Emp-config.xml");
		EmployeeJdbcImp empimp = context.getBean("myjdbcimp",EmployeeJdbcImp.class);
		public int empadded(Employee emp) {
			return empimp.addEmployee(emp);
			}
		
		public boolean authentic(int id ,String password) {
			Employee emp1 = new Employee();
			empimp.authenticate(id,null);
			
			if(password==emp1.getEmpPassword()) {
				return true;
			}
			return false;
			}
		
		public int update (Employee emp) {
			return empimp.updateEmployee(emp);
		}
		
		public int delete(int id) {
			return empimp.deleteEmployee(id);
		}
		
		public Employee getEmployee(int id) {
			return empimp.getEmployee(id);
			
		}
		
		public List<Employee> getAllEmp(){
			return empimp.getAllEmployee();
		}
		
	

}
