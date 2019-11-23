package YahooTest.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.stream.Collectors;

//aceasta este pagina de pornire, avem nevoie de adresa ei
@DefaultUrl("https://login.yahoo.com")
public class LoginPage extends PageObject {

    //trebuie selectam serverul yahoo, sa completam numele, parola si sa apasam butonul de Login
    //asadar vom crea cate un element pentru fiecare

    //butonul de Login il identificam dupa nume
    @FindBy(name="signin")
    private WebElementFacade loginButton;

    @FindBy(name="verifyPassword")
    private WebElementFacade verifyPassButton;


    //textBox-ul in care completam parola il identificam dupa nume
    @FindBy(name="password")
    private WebElementFacade passwordTextBox;

    //textBox-ul in care completam numele de utilizator il identificam dupa nume
    @FindBy(name="username")
    private WebElementFacade usernameTextBox;

    //DropBox-ul din care selectam serverul ftp il identificam dupa nume

    @FindBy(name="ftpserver")
    private WebElementFacade ftpserverDropBox;



    //vom defini metode pentru interactiunea simpla cu aceste elemente ale paginii de Login
    //in textbox-ul cu numele de utilizator vom scrie numele
    public void enter_username(String name) {
        usernameTextBox.type(name);
    }

    //in textbox-ul cu parola vom scrie parola
    public void enter_password(String ftp,String pass) {
        passwordTextBox.type(pass);
    }

    //din DropDownBox-ul cu serverul ftp vom selecta o valoare
    public void select_ftpserver(String ftp) {
        ftpserverDropBox.selectByValue(ftp);
    }



    //pe butonul de Login vom da un click
    public void click_login_button()   {
        loginButton.click();
    }

    //pe butonul de VerifyPasswordButton vom da un click
    public void click_verify_pass_button()   {
        verifyPassButton.click();
    }




}