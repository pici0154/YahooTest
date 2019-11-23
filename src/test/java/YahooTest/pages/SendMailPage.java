package YahooTest.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class SendMailPage extends PageObject  {


    //declarare buton send mail
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[1]/div/div[1]/nav/div/div[1]/a")
    private WebElementFacade sendMail;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[1]/div/div[2]/div[1]/div[1]/div/div[1]/div[3]/div/div/input")
    private WebElementFacade subjectTextBox;

    @FindBy(xpath = ("/html/body/div[1]/div/div[1]/div/div[1]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/div[2]/div/div[1]"))
    private WebElementFacade messageTextBox;

    @FindBy(xpath = "//*[@id=\"mail-app-component\"]/div[2]/div/div[2]/div[2]/div/button")
    private WebElementFacade sendEmailButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[1]/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/div/div/div[2]/div/ul/li/div/div/input[1]")
    private WebElementFacade sendToTextBox;

    @FindBy(xpath="/html/body/div[2]/div/div/div/div/div/div/div[1]/ul/li[2]/a")
    private WebElementFacade href;


    public void clickOnMailButton(){
        href.click ();

    }

    public void write_message(String emailAdrs, String subject,String message){
        sendMail.click ();

//        sendToTextBox.click ();
        sendToTextBox.type( emailAdrs );
  //      subjectTextBox.click ();
        subjectTextBox.type(subject);
    //    messageTextBox.click ();
        messageTextBox.type ( message );
    }

    public void sendEmail() {
        sendEmailButton.click();
    }

}
