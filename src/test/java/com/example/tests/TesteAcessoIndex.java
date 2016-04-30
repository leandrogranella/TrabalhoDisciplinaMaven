package com.example.tests;
import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import classes.MenuNavegacaoSuperior;
import classes.PortoClickContexto;

public class TesteAcessoIndex {
	public static PortoClickContexto portoclickContexto;

	@Before
	public void setUp() throws Exception {
		portoclickContexto = new PortoClickContexto(new FirefoxDriver());
		MenuNavegacaoSuperior.iniciar(portoclickContexto);
	}

	@Test
	public void testeAcessoIndex() throws Exception {
		MenuNavegacaoSuperior.clicarIconeDaPortoClick();
		MenuNavegacaoSuperior.estaNaIndex();
	}

	@After
	public void tearDown() throws Exception {
		portoclickContexto.sair();
	}
}
