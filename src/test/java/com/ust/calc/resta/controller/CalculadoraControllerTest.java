package com.ust.calc.resta.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.ust.calc.resta.service.Calculadora;

@RunWith(MockitoJUnitRunner.class)
public class CalculadoraControllerTest {

	private CalculadoraController calculadoraController;
	
	@Mock
	private Calculadora calculadora; 
	
	@Before
	public void setUp() {
		calculadoraController = new CalculadoraController(calculadora);
	}
	
	@Test
	public void happyPathTest() {
		Mockito.when(calculadora.resta(Mockito.anyInt(), Mockito.anyInt())).thenReturn(1);
		Integer resultado = calculadoraController.realizarResta(3, 2);
		assertThat(resultado).isEqualTo(1);
	}
	
	@Test
	public void noHappyPathTest() {
		Mockito.when(calculadora.resta(Mockito.anyInt(), Mockito.anyInt())).thenReturn(1);
		Integer resultado = calculadoraController.realizarResta(3, 2);
		assertThat(resultado).isNotEqualTo(3);
	}
	
}
