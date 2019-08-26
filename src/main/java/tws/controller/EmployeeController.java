package tws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tws.mapper.EmployeeMapper;
import tws.model.Employee;

@RestController
@RequestMapping("/controller")
public class EmployeeController {
	private EmployeeMapper mapper;
	
	@Autowired
	public EmployeeController(EmployeeMapper mapper) {
		this.mapper = mapper;
	}

	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return mapper.findEmployeeById(id);
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return mapper.findEmployees();
	}
	
	@PostMapping(path = "/employee", produces = "application/json")
	public void createEmployee(@RequestBody Employee employee) {
		mapper.insertEmployee(employee);
	}
}
