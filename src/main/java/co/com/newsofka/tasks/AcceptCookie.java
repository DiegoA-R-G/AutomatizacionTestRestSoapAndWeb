package co.com.newsofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.newsofka.ui.SelectMovie.BUTTON_COOKIE;

public class AcceptCookie implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_COOKIE)
        );
    }

    public static AcceptCookie accepCookie(){
        return new AcceptCookie();
    }
}
