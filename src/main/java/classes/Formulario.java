package classes;
import static org.junit.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.thoughtworks.selenium.webdriven.JavascriptLibrary;

public class Formulario {
	private static PortoClickContexto contexto = null;
	private static WebElement campoNome;
	private static WebElement campoEmail;
	private static WebElement campoMensagem;
	private static WebElement botaoDeEnvioDoFormulario;
	public static void iniciar(PortoClickContexto paginaContexto) {
		contexto = paginaContexto;
		contexto.driver.get(contexto.urlBase);
		
	}
	
	public static void abreFormulario() {
		contexto.driver.findElement(By.cssSelector("body > div.navbar.navbar-fixed-top.skrollable.skrollable-between > div > div.navbar-collapse.collapse > ul > li:nth-child(5) > a")).click();
		//mapearElementosHtml();
	}
	
	/*private static void mapearElementosHtml() {
		botaoDeEnvioDoFormulario = contexto.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		campoNome = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("SacNome")));
		campoEmail = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("SacEmail")));
		campoMensagem = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("SacMensagem")));
	}*/
	
	public static void preencheCamposDeNomeEMensagem() {
		//campoNome.clear();
		//campoNome.sendKeys("Leandro Granella Moraes");
		contexto.driver.findElement(By.id("nome")).clear();
	    contexto.driver.findElement(By.id("nome")).sendKeys("Leandro Granella Moraes");
	    contexto.driver.findElement(By.name("mensagem")).clear();
	    contexto.driver.findElement(By.name("mensagem")).sendKeys("teste");
		//campoMensagem.clear();
		//campoMensagem.sendKeys("teste");
	}
	
	public static void verificaMensagemQuandoCampoDoEmailNaoFoiPreenchido() {
		 assertEquals("Por favor, digite um e-mail válido", contexto.driver.findElement(By.cssSelector("#contact-form > form > div:nth-child(2) > div")).getText());
	}
	
	public static void preencheCamposDeEmailEMensagem() {
		contexto.driver.findElement(By.id("email")).clear();
		contexto.driver.findElement(By.id("email")).sendKeys("leandrogranella@gmail.com");
		contexto.driver.findElement(By.name("mensagem")).clear();
		contexto.driver.findElement(By.name("mensagem")).sendKeys("teste");
	}
	
	public static void verificaMensagemQuandoCampoDoNomeNaoFoiPreenchido() {
		assertEquals("Por favor, digite seu nome",contexto.driver.findElement(By.cssSelector("#contact-form > form > div:nth-child(1) > div")).getText());  
	}
	
	public static void preencheCamposDeNomeEEmail() {
		contexto.driver.findElement(By.id("nome")).clear();
	    contexto.driver.findElement(By.id("nome")).sendKeys("Leandro Granella Moraes");
	    contexto.driver.findElement(By.id("email")).clear();
	    contexto.driver.findElement(By.id("email")).sendKeys("leandrogranella@gmail.com");
	}
	
	public static void verificaMensagemQuandoCampoDaMensagemNaoFoiPreenchido() {
		// int i = 0;
	    
		  //  while (i <= 100)
		  //  {
		        
		   // }
		    
		   
		    
		    
		   // WebDriverWait wait = new WebDriverWait(driver, 10);
		    //WebDriverWait wait = new WebDriverWait(driver, 5);
		    //wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElementValue(By.cssSelector("#contact-form > form > div:nth-child(3) > div"), "")));
		  
		    //WebDriverWait wait = new WebDriverWait(driver,);
		    
		    
		   assertEquals("Escreva algo para nós", contexto.driver.findElement(By.xpath("//*[@id='contact-form']/form/div[3]/div")).getText());
	}
	
	public static void preencheTodosOsCampos() {
		contexto.driver.findElement(By.id("nome")).clear();
		contexto.driver.findElement(By.id("nome")).sendKeys("Leandro Granella Moraes");
		contexto.driver.findElement(By.id("email")).clear();
		contexto.driver.findElement(By.id("email")).sendKeys("leandrogranella@gmail.com");
		contexto.driver.findElement(By.name("mensagem")).clear();
		contexto.driver.findElement(By.name("mensagem")).sendKeys("teste");
	}
	
	public static void verificaMensagemDeSucessoDeEnvioDoFormulario() {
		assertEquals("Sua mensagem foi enviada com sucesso. Logo entraremos em contato. Obrigado!", contexto.driver.findElement(By.id("mensagem_de_ok")).getText());
	}
	
	public static void enviaFormulario() {
		JavascriptLibrary jsLib = new JavascriptLibrary(); 
	    jsLib.callEmbeddedSelenium(contexto.driver,"triggerMouseEventAt", contexto.driver.findElement(By.xpath("//button[@type='submit']")),"click", "0,0");
	}
}
