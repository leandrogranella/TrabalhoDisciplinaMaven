package com.example.tests;

import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import classes.MenuNavegacaoSuperior;
import classes.PortoClickContexto;

public class TesteAcessoClientes {
	
	public static PortoClickContexto portoclickContexto;
  
	@Before
	public void setUp() throws Exception {
		portoclickContexto = new PortoClickContexto(new FirefoxDriver());
		MenuNavegacaoSuperior.iniciar(portoclickContexto);
	}

	@Test
	public void testeAcessoClientes() throws Exception {
		MenuNavegacaoSuperior.clicarClientes();
		MenuNavegacaoSuperior.estaNaClientes();
	}

	@After
	public void tearDown() throws Exception {
		portoclickContexto.sair();
	}
}
