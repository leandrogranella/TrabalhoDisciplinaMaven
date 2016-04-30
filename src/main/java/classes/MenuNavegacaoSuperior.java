package classes;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.thoughtworks.selenium.webdriven.JavascriptLibrary;

public class MenuNavegacaoSuperior {
	private static PortoClickContexto contexto = null;
	public static void iniciar(PortoClickContexto paginaContexto) {
		contexto = paginaContexto;
		contexto.driver.get(contexto.urlBase);
		
	}
	
	public static void clicarClientes() {
		WebElement elementoHtml = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/ul/li[4]/a")));
		elementoHtml.click();
	}
	//concatenar uma url base do contexto com a section 
	public static void estaNaClientes() {
		assertEquals(contexto.urlBase + "#section-works", MenuNavegacaoSuperior.mapearUrlQueSeEncontra());
	}
	
	public static void clicarServicos() {
		WebElement elementoHtml = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > div.navbar.navbar-fixed-top.skrollable.skrollable-between > div > div.navbar-collapse.collapse > ul > li:nth-child(2) > a")));
		elementoHtml.click();
	}
	
	public static void estaNaServicos() {
		assertEquals(contexto.urlBase + "#section-services", MenuNavegacaoSuperior.mapearUrlQueSeEncontra());
	}
	
	public static void clicarSobre() {
		WebElement elementoHtml = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > div.navbar.navbar-fixed-top.skrollable.skrollable-between > div > div.navbar-collapse.collapse > ul > li:nth-child(3) > a")));
		elementoHtml.click();
	}
	
	public static void estaNaSobre() {
		assertEquals(contexto + "#section-about", MenuNavegacaoSuperior.mapearUrlQueSeEncontra());
	}
	
	public static void clicarHome() {
		WebElement elementoHtml = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > div.navbar.navbar-fixed-top.skrollable.skrollable-between > div > div.navbar-collapse.collapse > ul > li:nth-child(1) > a")));
		elementoHtml.click();
	}
	
	public static void estaNaHome() {
		assertEquals(contexto.urlBase, MenuNavegacaoSuperior.mapearUrlQueSeEncontra());
	}
	
	public static void clicarContato() {
		WebElement elementoHtml = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > div.navbar.navbar-fixed-top.skrollable.skrollable-between > div > div.navbar-collapse.collapse > ul > li:nth-child(5) > a")));
		elementoHtml.click();
	}
	
	public static void estaNaContato() {
		assertEquals(contexto.urlBase + "#section-contact", MenuNavegacaoSuperior.mapearUrlQueSeEncontra());
	}
	
	public static void clicarIconeDaPortoClick() {
		WebElement elementoHtml = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("img")));
		elementoHtml.click();
	}
	
	public static void estaNaIndex() {
		assertEquals(contexto.urlBase + "index.html", MenuNavegacaoSuperior.mapearUrlQueSeEncontra());
	}
	
	public static void clicarQueroUmSiteOuMarketingDigital() {
		JavascriptLibrary jsLib = new JavascriptLibrary(); 
	    jsLib.callEmbeddedSelenium(contexto.driver,"triggerMouseEventAt", contexto.driver.findElement(By.cssSelector("body > section.featured > div > div > div > div > a")),"click", "0,0");
	}
	
	public static void estaNaQueroUmSiteOuMarketingDigital() {
		assertEquals(contexto.urlBase + "#section-contact", MenuNavegacaoSuperior.mapearUrlQueSeEncontra());
	}
	
	public static String mapearUrlQueSeEncontra() {
		return contexto.driver.getCurrentUrl();
		
	}

	
	
	
	
	
}
