package com.ust.calc.resta.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraControllerTest {

	private CalculadoraController calculadoraController;
	
	@Before
	public void setUp() {
		calculadoraController = new CalculadoraController();
	}
	
	@Test
	public void happyPathTest() {
		Integer resultado = calculadoraController.realizarResta(3, 2);
		assertThat(resultado).isEqualTo(1);
	}
	
	@Test
	public void noHappyPathTest() {
		Integer resultado = calculadoraController.realizarResta(3, 2);
		assertThat(resultado).isNotEqualTo(3);
	}
	
}
