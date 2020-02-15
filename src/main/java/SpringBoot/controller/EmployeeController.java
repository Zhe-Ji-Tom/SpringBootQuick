package SpringBoot.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import SpringBoot.dao.EmployeeDao;
import SpringBoot.entities.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDao employeeDao;
	
	@GetMapping("/emps")
	public String list(Model model) {
		Collection<Employee> employees = employeeDao.getAll();
		
		model.addAttribute("emps", employees);
		
		return "emp/list";
	}
}
