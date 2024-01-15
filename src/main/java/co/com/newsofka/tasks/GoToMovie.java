package co.com.newsofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.newsofka.ui.SelectMovie.*;

public class GoToMovie implements Task {
    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Click.on(BUTTON_PELICULA),
                Click.on(BUTTON_FAVORITE)
        );
    }
    public static GoToMovie goToMovie(){
        return new GoToMovie();
    }
}
