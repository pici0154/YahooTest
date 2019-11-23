package YahooTest.pages;

import com.google.inject.internal.cglib.proxy.$FixedValue;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

//corespunde paginii care ii arata utilizatorului contul sau
public class AccountPage extends PageObject {

    //vom interactiona cu butonul de logout si vom verifica daca am ajuns in aceasta pagina

    //butonul de logout il identificam dupa xpath deoarece nu am gasit pentru el un mijloc mai simplu
    @FindBy(xpath = "//*[@id=\"StatusbarForm\"]/a[3]/img")
    private WebElementFacade logoutButton;

    //am mai găsit 2 elemente mai usor de identificat care contin numele utilizatorului, de exemplu, TextBox-ul care
    // contine numele directorului in care ne aflam, situat in partea e stanga sus a paginii
    //nu putem sa ne folosim de nume in identificarea sa, deoarece nu e unicul element cu numele "directory",
    // de aceea folosim si pentru acesta xpath
    @FindBy(xpath = "/html/body/header/div/div[2]/div/div[3]/div[1]/div/label/span")
    private WebElementFacade currentUser;

    @FindBy(css = "input[value=\"Delete\"]")
    private WebElementFacade deleteDirButton;


    //pe butonul de logout vom da click
    public void click_logout() {
        logoutButton.click ();
    }

    //vom scoare valoarea directorului curent, pentru a verifica in steps daca ea se termina cu numele utilizatorului
    public String get_currentUser() {
        return currentUser.getValue ();
    }


}