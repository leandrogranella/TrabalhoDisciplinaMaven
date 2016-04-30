package com.example.tests;
import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import classes.Formulario;
import classes.PortoClickContexto;

public class TesteEnvioFormularioCampoEmailSemPreencher {
	public static PortoClickContexto portoclickContexto;

	@Before
	public void setUp() throws Exception {
		portoclickContexto = new PortoClickContexto(new FirefoxDriver());
		Formulario.iniciar(portoclickContexto);
	}

	@Test
	public void testeEnvioFormularioCampoEmailSemPreencher() throws Exception {
		Formulario.abreFormulario();
		Formulario.preencheCamposDeNomeEMensagem();
		Formulario.enviaFormulario();
		Formulario.verificaMensagemQuandoCampoDoEmailNaoFoiPreenchido();
	}

	@After
	public void tearDown() throws Exception {
		portoclickContexto.sair();
	}
}
