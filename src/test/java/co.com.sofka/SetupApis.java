package co.com.sofka;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class SetupApis {
    protected Actor actor = new Actor ("Jhorman");

    protected void actorCallAnAPi(String urlBase){
        actor.can(CallAnApi.at(urlBase));
    }
}
