package YahooTest.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LogoutPage extends PageObject {



    @FindBy(xpath = "/html/body/header/div/div[2]/div/div[3]/div[1]/div/label")
    private WebElementFacade clickProfile;

    @FindBy(xpath = "/html/body/header/div/div[2]/div/div[3]/div[1]/div/div/div/a[3]")
    private WebElementFacade clickLogout;


    public void logoutMail(){
        clickProfile.click ();
        clickLogout.click ();
    }
}
