package br.com.rhinosistemas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rhinosistemas.model.Employee;
import br.com.rhinosistemas.repository.EmployeeRepository;
import br.com.rhinosistemas.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class ClasseController {

	@Autowired
    private EmployeeService employeeService;
 
	@Autowired
	private EmployeeRepository employeeRepository;
	
    @GetMapping("/employees")
    public Integer metodoGet() {
        return employeeService.retornaSoma(10, 20);
    }
	
    @PostMapping("/salvar")
    public void salvarEmployee(Employee employee) {
    	employeeRepository.save(employee);
    }
    
}
