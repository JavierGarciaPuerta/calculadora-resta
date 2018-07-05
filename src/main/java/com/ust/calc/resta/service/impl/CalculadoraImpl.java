package com.ust.calc.resta.service.impl;

import org.springframework.stereotype.Service;

import com.ust.calc.resta.service.Calculadora;

@Service
public class CalculadoraImpl implements Calculadora {
	
	@Override
	public Integer resta(Integer a, Integer b) {
		Integer resultado = a-b;
		return resultado;
	}
}
