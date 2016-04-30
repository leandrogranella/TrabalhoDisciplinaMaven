package com.example.tests;
import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import classes.MenuNavegacaoSuperior;
import classes.PortoClickContexto;

public class TesteAcessoSobre {
	public static PortoClickContexto portoclickContexto;
	
	@Before
	public void setUp() throws Exception {
		portoclickContexto = new PortoClickContexto(new FirefoxDriver());
		MenuNavegacaoSuperior.iniciar(portoclickContexto);
	}

	@Test
	public void testeAcessoSobre() throws Exception {
		MenuNavegacaoSuperior.clicarSobre();
		MenuNavegacaoSuperior.estaNaSobre();
	}

	@After
	public void tearDown() throws Exception {
		portoclickContexto.sair();
    }
}
