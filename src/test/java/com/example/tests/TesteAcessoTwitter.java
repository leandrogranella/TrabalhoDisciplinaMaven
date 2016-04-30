package com.example.tests;
import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import classes.MenuNavegacaoRodape;
import classes.PortoClickContexto;

public class TesteAcessoTwitter {
	public static PortoClickContexto portoclickContexto;
	
	@Before
	public void setUp() throws Exception {
		portoclickContexto = new PortoClickContexto(new FirefoxDriver());
		MenuNavegacaoRodape.iniciar(portoclickContexto);
	}

	@Test
	public void testeAcessoTwitter() throws Exception {
		MenuNavegacaoRodape.clicarIconeTwitter();
		MenuNavegacaoRodape.estaNoTwitter();
	}

	@After
	public void tearDown() throws Exception {
		portoclickContexto.sair();
	}
}
