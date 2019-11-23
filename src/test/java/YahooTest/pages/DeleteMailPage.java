package YahooTest.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;


public class DeleteMailPage extends PageObject {


        //dam click butonul de mailuri trimise
        @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[1]/div/div[1]/nav/div/div[3]/div[1]/ul/li[5]/div/a")
        private WebElementFacade sentButton;



        @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[1]/div/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/ul/li[2]/a/div/div[1]/div[1]/button")
        private WebElementFacade checkBoxButton;

        @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/button")
        private WebElementFacade deleteButton;


    public  void deleteMail(){

        sentButton.click ();
        checkBoxButton.click ();
        deleteButton.click ();
    }

}
