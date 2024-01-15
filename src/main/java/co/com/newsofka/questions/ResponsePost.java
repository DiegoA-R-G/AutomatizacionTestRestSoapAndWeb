package co.com.newsofka.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ResponsePost implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return SerenityRest.lastResponse().asString();
    }

    public static ResponsePost returnStringBodyPost(){
        return new ResponsePost();
    }
}
