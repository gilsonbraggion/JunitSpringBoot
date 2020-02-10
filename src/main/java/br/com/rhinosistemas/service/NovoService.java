package br.com.rhinosistemas.service;

import org.springframework.stereotype.Service;

@Service
public class NovoService {
	
	public Integer somaNumeros(int num1, int num2) {
		
		if (num1 == 0) {
			return 0 + num2;
		} else if (num2 == 0) {
			return 0 + num1;
		}
		
		return num1 + num2;
	}
	
}
