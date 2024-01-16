package co.com.sofka.stepdefinitions;

import co.com.newsofka.tasks.Post;
import co.com.sofka.SetupApis;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Consequence;
import org.apache.http.HttpStatus;

import static co.com.newsofka.questions.ResponsePost.returnStringBodyPost;
import static java.lang.System.out;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.CoreMatchers.containsString;

public class GetTestStepDefinition extends SetupApis {

    @Given("que el usuario quiera crear su cuenta en req res")
    public void queElUsuarioQuieraCrearSuCuentaEnReqRes() {
        actorCallAnAPi("https://reqres.in/api");

    }

    @When("hago la peticion de tipo Post")
    public void hagoLaPeticionDeTipoPost() {
        actor.attemptsTo(
                Post.sendRegistrationData()
                        .withTheResource("/register")
                        .withTheBody("{\"email\": \"eve.holt@reqres.in\", \"password\": \"cityslicka\"}")
        );
    }

    @Then("el resultado deberia ser un codigo {int}")
    public void elResultadoDeberiaSerUnCodigo(Integer int1) {

        String respuesta= returnStringBodyPost().answeredBy(actor);
        out.println("Respuesta del body \n" + respuesta);

        actor.should(

                (Consequence<?>) seeThatResponse("El codigo de respuesta es: " + HttpStatus.SC_OK,
                        response -> response.statusCode(int1)),
                seeThat("contiene el elemento",
                        response->respuesta,containsString("QpwL5tke4Pnpja7X4"))

        );
    }
    @Then("un json con el token del usuario")
    public void unJsonConElTokenDelUsuario() {

    }
}
