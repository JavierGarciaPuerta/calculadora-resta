package com.ust.calc.resta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ust.calc.resta.service.Calculadora;

@RestController
public class CalculadoraController {
	
	@Autowired
	private Calculadora calculadora;
	
	@GetMapping("/resta/{uno}/{dos}")
	public Integer realizarResta(@PathVariable Integer uno, @PathVariable Integer dos) {
		return calculadora.resta(uno, dos);
	}

}
