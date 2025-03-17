package steps;

import qa.DriverFactory;


import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HomePage;

public class HomeSteps {

	//private WebDriver driver;
	
	private HomePage homePage = new HomePage(DriverFactory.getDriver());

	@Dado("que eu acesse o site da Amazon")
	public void acessarAmazon()  {
		DriverFactory.getDriver().get("https://www.amazon.com.br");
	}
	
	@Quando("digito {string} na barra de pesquisa")
	public void setBarraPesquisa(String produto) throws Throwable {
		homePage.setBarraPesquisa(produto);
	}
	@Entao("valido se as sugestoes de pesquisa exibem as opcoes {string}")
	public void validarSugestoes(String sugestoes) throws Throwable {
		homePage.validarSugestoes(sugestoes);
	}
	

}
