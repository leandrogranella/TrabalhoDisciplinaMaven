package com.example.tests;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import classes.Formulario;
import classes.PortoClickContexto;

public class TesteEnvioFormularioCampoMensagemSemPreencher {
	public static PortoClickContexto portoclickContexto;

	@Before
	public void setUp() throws Exception {
		portoclickContexto = new PortoClickContexto(new FirefoxDriver());
		Formulario.iniciar(portoclickContexto);
	}

	@Test
	public void testeEnvioFormularioMensagemSemPreencher() throws Exception {
		//driver.get(baseUrl + "/");
		//driver.findElement(By.linkText("Contato")).click();
		//driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/ul/li[5]/a")).click();
    //driver.findElement(By.cssSelector("body > div.navbar.navbar-fixed-top.skrollable.skrollable-between > div > div.navbar-collapse.collapse > ul > li:nth-child(5) > a")).click();
    //driver.findElement(By.id("nome")).clear();
    //driver.findElement(By.id("nome")).sendKeys("Leandro Granella Moraes");
    //driver.findElement(By.id("email")).clear();
    //driver.findElement(By.id("email")).sendKeys("leandrogranella@gmail.com");
    	//.findElement(By.name("mensagem")).clear();
    	//driver.findElement(By.name("mensagem")).sendKeys("teste");
    	//((JavascriptExecutor)driver).executeScript("arguments[0].checked = true;", driver.findElement(By.xpath("//button[@type='submit']")));
    //JavascriptLibrary jsLib = new JavascriptLibrary(); 
    //jsLib.callEmbeddedSelenium(driver,"triggerMouseEventAt", driver.findElement(By.xpath("//button[@type='submit']")),"click", "0,0");
    //assertEquals("http://www.portoclick.com.br/#section-contact",driver.getCurrentUrl());
    
   // int i = 0;
    
  //  while (i <= 100)
  //  {
        
   // }
    
   
    
    
   // WebDriverWait wait = new WebDriverWait(driver, 10);
    //WebDriverWait wait = new WebDriverWait(driver, 5);
    //wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElementValue(By.cssSelector("#contact-form > form > div:nth-child(3) > div"), "")));
  
    //WebDriverWait wait = new WebDriverWait(driver,);
    
    
   // assertEquals("Escreva algo para nós", driver.findElement(By.xpath("//*[@id='contact-form']/form/div[3]/div")).getText());
		Formulario.abreFormulario();
		Formulario.preencheCamposDeNomeEEmail();
		Formulario.enviaFormulario();
		Formulario.verificaMensagemQuandoCampoDaMensagemNaoFoiPreenchido();
	}

	@After
	public void tearDown() throws Exception {
		portoclickContexto.sair();
	}
}
