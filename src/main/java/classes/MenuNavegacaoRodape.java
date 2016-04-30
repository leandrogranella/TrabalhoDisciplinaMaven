package classes;
import static org.junit.Assert.*;
import org.openqa.selenium.By;

import com.thoughtworks.selenium.webdriven.JavascriptLibrary;

public class MenuNavegacaoRodape {
	private static PortoClickContexto contexto = null;
	
	public static void iniciar(PortoClickContexto paginaContexto) {
		contexto = paginaContexto;
		contexto.driver.get(contexto.urlBase);
		
	}
	
	public static void clicarIconeFacebook() {
		JavascriptLibrary jsLib = new JavascriptLibrary(); 
		jsLib.callEmbeddedSelenium(contexto.driver,"triggerMouseEventAt", contexto.driver.findElement(By.cssSelector("a.icoFacebook")),"click", "0,0");
	}
	
	public static void estaNoFacebook() {
		assertEquals("https://www.facebook.com/portoclick", MenuNavegacaoRodape.mapearUrlQueSeEncontra());
	}
	
	public static void clicarIconeGooglePlus() {
		JavascriptLibrary jsLib = new JavascriptLibrary(); 
		jsLib.callEmbeddedSelenium(contexto.driver,"triggerMouseEventAt", contexto.driver.findElement(By.cssSelector("a.icoGoogle")),"click", "0,0");
	}
	
	public static void estaNoGooglePlus() {
		assertEquals("https://plus.google.com/107123307951367585084/about", MenuNavegacaoRodape.mapearUrlQueSeEncontra());
	}
	
	public static void clicarIconeTwitter() {
		JavascriptLibrary jsLib = new JavascriptLibrary(); 
		jsLib.callEmbeddedSelenium(contexto.driver,"triggerMouseEventAt", contexto.driver.findElement(By.cssSelector("a.icoTwitter")),"click", "0,0");
	}
	
	public static void estaNoTwitter() {
		assertEquals("https://twitter.com/portoclick", MenuNavegacaoRodape.mapearUrlQueSeEncontra());
	}
	
	public static String mapearUrlQueSeEncontra() {
		return contexto.driver.getCurrentUrl();
		
	}

	
}
