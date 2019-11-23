package YahooTest.steps.serenity;

import YahooTest.pages.SendMailPage;

public class SendMailSteps {

    private SendMailPage sendEmail;

    public void click_on_mail_and_send( ){
        sendEmail.clickOnMailButton();
        sendEmail.write_message ("ionutpop26@yahoo.com","Hello!!","Ce faci?");
        sendEmail.sendEmail ();

    }

}
