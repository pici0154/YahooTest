package YahooTest.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

//corespunde paginii de raportare a erorilor
public class ErrorPage extends PageObject {

    @FindBy(xpath="/html/body/div[2]/div[2]/div[1]/div[2]/div/form/p[1]")
    private WebElementFacade errorText;
    //aceasta functie permite extragerea pe baza unor tag-uri a parti din continutul unei pagini web
    //dorim sa ajungem la un text care contine cuvantul "error", care se afla intr-o lista de div-uri, respectiv o sublista de h1
    public List<String> get_textError() {

            //se ia lista de div-uri de pe pagina
            WebElementFacade bodyList = find(By.tagName("div"));
            //intr-unul din div-uri se afla o lista de p in care se afla cuvantul cautat de noi
            return bodyList.findElements(By.tagName("p")).stream()
                    .map( element -> element.getText() )
                    .collect(Collectors.toList());
    }


}
