package com.example.tests;
import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import classes.MenuNavegacaoSuperior;
import classes.PortoClickContexto;

public class TesteAcessoServicos {

	public static PortoClickContexto portoclickContexto;

	@Before
	public void setUp() throws Exception {
		portoclickContexto = new PortoClickContexto(new FirefoxDriver());
		MenuNavegacaoSuperior.iniciar(portoclickContexto);
	}

	@Test
	public void testeAcessoServicos() throws Exception {
		MenuNavegacaoSuperior.clicarServicos();
		MenuNavegacaoSuperior.estaNaServicos();
	}

	@After
	public void tearDown() throws Exception {
		portoclickContexto.sair();
	}
}
