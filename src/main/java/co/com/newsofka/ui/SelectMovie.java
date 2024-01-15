package co.com.newsofka.ui;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectMovie extends PageObject{
    public static final Target BUTTON_PELICULA = Target
            .the("Pelicula 1")
            .located(By.xpath("//*[@id='trending_scroller']/div/div[1]/div[1]/div[1]/a")
            );
    public static final Target BUTTON_COOKIE= Target
            .the("accept cookies")
            .located(By.xpath("//button[contains(text(), 'Aceptar todas las cookies')]")
            );
    public static final Target BUTTON_FAVORITE = Target
            .the("Favorites")
            .located(By.xpath("//*[@id='original_header']/div[2]/section/ul/li[3]")
            );
}
