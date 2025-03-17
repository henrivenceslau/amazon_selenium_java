package pages;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setBarraPesquisa(String produto) {
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(produto);
	}
	
	public void validarSugestoes(String sugestoes) {
		
		String regex = "[,\\;]";
		String[] arraySugestoesEsperadas = sugestoes.split(regex);
		int contadorSugestoesEncontradas = 0;

		List<WebElement> sugestoesExibidas = driver.findElements(By.cssSelector(".s-suggestion.s-suggestion-ellipsis-direction"));
		for (WebElement elemento : sugestoesExibidas) {
			for (String s: arraySugestoesEsperadas) {
				if (elemento.getAttribute("aria-label").equalsIgnoreCase(s.stripLeading().stripTrailing())) {
					contadorSugestoesEncontradas += 1;
				}
			}
		}
		assertEquals(arraySugestoesEsperadas.length, contadorSugestoesEncontradas);
	}
	
	
	
}
