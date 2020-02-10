package br.com.rhinosistemas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rhinosistemas.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
 
    public Employee findByName(String name);
 
}