package YahooTest.features.search;



//acest fisier se executa
//@RunWith(ParametrizSerenityRunner.class)

import YahooTest.steps.serenity.*;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;


//aici avem teste parametrizate
@RunWith(SerenityParameterizedRunner.class)
//fisierul cu datele de intrare este cel precizat pe randul urmator
@UseTestDataFrom("C:\\Users\\Roxana\\YahooTest\\src\\test\\resources\\NonValid.csv")
public class NonValidParametrizedLoginTest {

    @Managed(uniqueSession = true)

    //vom folosi pasii corespunzatori paginii de login si cea care raporteaza eroarea
    @Steps
    public LoginSteps login;

    @Steps
    public ErrorSteps errors;

    //acestia sunt parametrii nostri - care se vor citi de pe fiecare linie a fisierului
    String server, user, password;

    @Issue("#errorLogin-1")
    @Test
    public void NonValidLogintest() {
        //pornim de la pagina de login
        login.is_the_home_page();

        //se introduc toate datele (cate un rand citit din fisierul de intrare) si se da click pe butonul de Login
        login.enters_data_and_click_login(server,user,password);
        //verificam ca am ajuns pe pagina de raportare a erorii
        //errors.should_see_text ( "incorect" );
    }

}