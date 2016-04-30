package com.example.tests;
import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import classes.Formulario;
import classes.PortoClickContexto;

public class TesteEnvioFormularioCampoNomeSemPreencher {
	
	public static PortoClickContexto portoclickContexto;

	@Before
	public void setUp() throws Exception {
		portoclickContexto = new PortoClickContexto(new FirefoxDriver());
		Formulario.iniciar(portoclickContexto);
	}

	@Test
	public void testeEnvioFormularioCampoNomeSemPreencher() throws Exception {
		Formulario.abreFormulario();
		Formulario.preencheCamposDeEmailEMensagem();
		Formulario.enviaFormulario();
		Formulario.verificaMensagemQuandoCampoDoNomeNaoFoiPreenchido();
	}

	@After
	public void tearDown() throws Exception {
		portoclickContexto.sair();
	}
}
