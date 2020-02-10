package br.com.rhinosistemas;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.rhinosistemas.model.Employee;
import br.com.rhinosistemas.repository.EmployeeRepository;
import br.com.rhinosistemas.service.EmployeeService;

@SpringBootTest
class SpringBootJunitApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeService employeeService;

	@Test
	void contextLoads() {

		Employee emp = new Employee("Gilson");

		emp.setId(1l);
		emp.setName("Teste");

		emp.getId();
		emp.getName();

		Employee alex = new Employee("alex");
		employeeRepository.save(alex);

		employeeService.getNome();

		employeeService.retornaSoma(10, 20);
		employeeService.retornaSoma(0, 20);
		employeeService.retornaSoma(10, 0);

		// when
		Employee found = employeeRepository.findByName(alex.getName());

		// then

		assertTrue(found.getName().equalsIgnoreCase(alex.getName()));
	}

	@Test
	void testeMain() {
		SpringBootJunitApplication.main(new String[] {});

	}
}
