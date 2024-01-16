package co.com.sofka.stepdefinitions;

import co.com.sofka.SetupApis;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import co.com.newsofka.tasks.Suma;
import net.serenitybdd.screenplay.rest.questions.LastResponse;
import org.assertj.core.api.Assertions;

public class GetSoapTestStepDefinition extends SetupApis {
     @Given("que el usuario quiera sumar un numero a servicio soap")
    public void queElUsuarioQuieraSumarUnNumeroAServicioSoap() {
         actorCallAnAPi("http://www.dneonline.com/calculator.asmx");
    }

    @When("hago la suma de 1 y 2")
    public void hagoLaSuma() {
        actor.attemptsTo(Suma.suma(1,2));
    }

    @Then("obtengo la suma de el servicio soap")
    public void obtengoLaSumaDeElServicioSoap() {

    }

}
