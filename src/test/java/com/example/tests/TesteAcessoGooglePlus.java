package com.example.tests;
import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import classes.MenuNavegacaoRodape;
import classes.PortoClickContexto;

public class TesteAcessoGooglePlus {
	public static PortoClickContexto portoclickContexto;

	@Before
	public void setUp() throws Exception {
		portoclickContexto = new PortoClickContexto(new FirefoxDriver());
		MenuNavegacaoRodape.iniciar(portoclickContexto);
	}

	@Test
	public void testeAcessoGooglePlus() throws Exception {
		MenuNavegacaoRodape.clicarIconeGooglePlus();
		MenuNavegacaoRodape.estaNoGooglePlus();
	}

	@After
	public void tearDown() throws Exception {
		portoclickContexto.sair();
	}
}
