package co.com.newsofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollToElement implements Task{

    private final Target target;

    public ScrollToElement(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement element = target.resolveFor(actor);
        actor.attemptsTo(
            Scroll.to(element)
        );
    }

    public static ScrollToElement scrollToElement(Target target) {
        return instrumented(ScrollToElement.class, target);
    }
}
