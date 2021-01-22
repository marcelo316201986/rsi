
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;



public class step {
	

	@Given("^Coloco usuario \"([^\"]*)\";$")
	public void coloco_usuario(String arg1) throws Throwable {



	}

	@Given("^Senha\"([^\"]*)\";$")
	public void senha(String arg1) throws Throwable {
		throw new PendingException();
	}

}
