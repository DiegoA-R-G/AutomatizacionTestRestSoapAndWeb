package co.com.sofka.stepdefinitions;

import co.com.sofka.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static co.com.newsofka.tasks.AcceptCookie.accepCookie;
import static co.com.newsofka.tasks.GoToMovie.goToMovie;
import static co.com.newsofka.tasks.OpenPageInit.openPageInit;
import static co.com.newsofka.tasks.ScrollToElement.scrollToElement;
import static co.com.newsofka.ui.SelectMovie.BUTTON_PELICULA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FavoritoStepDefinition extends Setup {

    @Given("que el usuario esta en la pagina de inicio")
    public void queElUsuarioEstaPaginaIluminacionDetalle() {
        actorSetupTheBrowser("Diego");
        theActorInTheSpotlight().wasAbleTo(
                openPageInit(),
                accepCookie()
        );
    }

    @When("el usuario selecciona la pelicula")
    public void elUsuarioDaClicPrimerProductoLista() {
        theActorInTheSpotlight().wasAbleTo(
                scrollToElement(BUTTON_PELICULA),
                goToMovie()
        );

    }

    @Then("el usuario da clic en el boton para agregar a favoritos")
    public void ElUsuarioVerPaginaProductoDetalle() {

        quitarDriver();
    }
    // metodo post api

}