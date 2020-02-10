package br.com.rhinosistemas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private NovoService novoService;
	
	public String getNome() {
		return "Nome";
	}
	
	public Integer retornaSoma(int num1, int num2) {
		return novoService.somaNumeros(num1, num2);
	}
	
}
