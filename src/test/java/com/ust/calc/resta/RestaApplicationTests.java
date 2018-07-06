package com.ust.calc.resta;

import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.ust.calc.resta.service.Calculadora;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class RestaApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private Calculadora calculadora;
	
	private Integer restaResult;
	
	@Before
	public void setup() {
		doReturn(restaResult).when(calculadora).resta(Mockito.any(Integer.class), Mockito.any(Integer.class));
	}
	
	
	@Test
	public void contextLoads() throws Exception {
		
		mockMvc
		.perform(get("/resta/8/3"))
		.andExpect(status().isOk());

	
	}

}
