package YahooTest.features.search;


import YahooTest.steps.serenity.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

//acest fisier se executa
@RunWith(SerenityRunner.class)
public class LoginLogout {

    @Managed(uniqueSession = true)
    WebDriver webdriver;
    //vom folosi pasii corespunzatori paginii de login si account
    @Steps
    public LoginSteps login;

    @Steps
    public AccountSteps accountSteps;

    @Steps
    public SendMailSteps sendMailSteps;

    @Steps
    public DeleteMailSteps deleteMailSteps;

    @Steps
    public LogoutSteps logoutSteps;

    @Issue("#login-1")
    @Test
    public void validLogintest()  {
       //pornim de la pagina de login
       login.is_the_home_page();
       //se introduc toate datele si se da click pe input field de Login
       login.enters_data_and_click_login("https:mail.yahoo.com","roxy23georgy@yahoo.com", "Mai2019!" );

        // click pe mail, scrierea textului in mail si trimitere
        sendMailSteps.click_on_mail_and_send (  );

        // selecteaza ultimul mail si il sterge
        deleteMailSteps.delete_mail ();

        // deconectare user
        logoutSteps.logout_mail ();

    }

}