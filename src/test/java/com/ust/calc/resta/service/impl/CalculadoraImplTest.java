package com.ust.calc.resta.service.impl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.ust.calc.resta.service.Calculadora;

public class CalculadoraImplTest {

	private Calculadora calculadora;
	
	@Before
	public void setUp() {
		calculadora = new CalculadoraImpl();
	}
	
	@Test
	public void happyPathTest() {
		Integer resultado = calculadora.resta(3, 2);
		assertThat(resultado).isEqualTo(1);
	}
	
	@Test
	public void noHappyPathTest() {
		Integer resultado = calculadora.resta(3, 2);
		assertThat(resultado).isNotEqualTo(3);
	}
}
