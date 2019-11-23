package YahooTest.steps.serenity;

import YahooTest.pages.ErrorPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

//in aceasta clasa definim pasii de urmat in pagina de raportare a erorii
public class ErrorSteps {
    WebDriver driver;
    //avem nevoie de pagina de raportare a erorii
     ErrorPage errorPage;

    //in acest pas vom verifica daca se afla testul "error" in locul identificat de pe pagina
    @Step
    public void should_see_text(String text) {
    // verificam daca URL-ul pe care ne-am logat e cel dorit
        assertThat(errorPage.get_textError(), hasItem(containsString(text)));
    }




}