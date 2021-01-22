package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSteps {
	
	@Given("^o acesso ao sistema;$")
	public void o_acesso_ao_sistema(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\googledriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://advantageonlineshopping.com/#/");
	  WebElement abrirLogin = driver.findElement(By.id("speakersImg"));
	  abrirLogin.click();
	    
	    
	  //  @FindBy(how = How.ID, using = "menuUser")
	 //   private WebElement IconeMenuser;
	}

	@Given("^clicar no botao do ultilizador;$")
	public void clicar_no_botao_do_ultilizador() {
		
		
		
	       
	}

	@Given("^preencher usuario e senha;$")
	public void preencher_usuario_e_senha() {
	   
		
	}

	@Then("^verificar se foi feito login com sucesso;$")
	public void verificar_se_foi_feito_login_com_sucesso() {
	    throw new PendingException();
	}

}
