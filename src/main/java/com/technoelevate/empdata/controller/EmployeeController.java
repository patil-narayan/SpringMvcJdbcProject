package com.technoelevate.empdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.technoelevate.empdata.controller.dao.EmployeeJdbc;
import com.technoelevate.empdata.controller.dto.Employee;
import com.technoelevate.empdata.controller.service.AppService;

@Controller

public class EmployeeController {
	@Autowired
	AppService app;
	
	@GetMapping("/home")
	public String addEmp(ModelMap map) {
		return "EmpRegistration";
	
	}
	
	@PostMapping("/inserted")
	public String insertEmp(ModelMap map,Employee emp) {
		if(emp!=null) {
			app.empadded(emp);
			map.addAttribute("added",emp);
			map.addAttribute("msg","Added");
		}
		else {
			map.addAttribute("msg","Data Not Inserted");
		}
		return "EmpDisplay";
		
	}
	@GetMapping("/Login")
	public String getLogin(ModelMap map) {
		return "EmpLoginPage";
	}
	@PostMapping("/Login1")
	public String getAuthenticate(ModelMap map,@RequestParam("EmpId")int id,@RequestParam("EmpPassword")String password) {
	boolean Employee=app.authentic(id, password);
	if(Employee==true) {
		return "HomePage";
	}
	return "EmpLoginPage";
		
	}
	
	@PostMapping("/")
	public String getUpdate(ModelMap map,Employee emp) {
		if(emp!=null) {
			app.empadded(emp);
			map.addAttribute("added",emp);
			map.addAttribute("msg","Added");
		}
		else {
			map.addAttribute("msg","Data Not Inserted");
		}
		return "UpdateEmp";
	}
	
	public String getDelete(ModelMap map,Employee emp) {
		if(emp!=null) {
			app.empadded(emp);
			map.addAttribute("added",emp);
			map.addAttribute("msg","Added");
		}
		else {
			map.addAttribute("msg","Data Not Inserted");
		}
		return "DeleteEmp";
	}
	
	public String getEmployee(@RequestParam("id")int id,ModelMap map) {
		Employee emp = app.getEmployee(id);
		map.addAttribute("Employees",emp);
		return "getEmployee";
	}
	
	
	public String getAllEmployee(Employee emp,ModelMap map) {
		List<Employee> empl= app.getAllEmp();
		map.addAttribute("MyEmp",empl);
		map.addAttribute("msg", "Wellcome Employees");
		return "getAllEmp";
	}

}
