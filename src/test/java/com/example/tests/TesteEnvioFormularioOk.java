package com.example.tests;
import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import classes.Formulario;
import classes.PortoClickContexto;

public class TesteEnvioFormularioOk {
	public static PortoClickContexto portoclickContexto;

	@Before
	public void setUp() throws Exception {
		portoclickContexto = new PortoClickContexto(new FirefoxDriver());
		Formulario.iniciar(portoclickContexto);
	}

	@Test
	public void testeEnvioFormularioOk() throws Exception {
		Formulario.abreFormulario();
		Formulario.preencheTodosOsCampos();
		Formulario.enviaFormulario();
		Formulario.verificaMensagemDeSucessoDeEnvioDoFormulario();
    
	}

	@After
	public void tearDown() throws Exception {
		portoclickContexto.sair();
	}
  }

