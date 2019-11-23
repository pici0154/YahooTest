package YahooTest.steps.serenity;


import YahooTest.pages.LoginPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

//aici se grupeaza pasii prin care interactionam cu pagina de Login
public class LoginSteps {
    //folosim pagina de login
    LoginPage loginPage;

    //deschide pagina - aceasta este pagina de pornire
    @Step
    public void is_the_home_page() {
        loginPage.open();
    }

    //grupam pasii de selectare a serverului ftp, introducere a numelui de utilizator, paroleisi actionarea butonului de Login
    @Step
    //public void enters_data_and_click_login(String ftp, String name, String pass) {
    public void enters_data_and_click_login(String ftp, String name, String pass)   {

        loginPage.enter_username(name);
        loginPage.click_login_button();
        loginPage.enter_password(ftp,pass);
        loginPage.click_verify_pass_button();

    }


}