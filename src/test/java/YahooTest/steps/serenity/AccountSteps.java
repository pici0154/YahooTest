package YahooTest.steps.serenity;
import YahooTest.pages.AccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.jruby.RubyBoolean;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertTrue;

//in aceasta clasa definim pasii de urmat in pagina contului utilizatorului
public class AccountSteps {

    //avem nevoie de pagina utilizatorului
    AccountPage accountPage;

    //un pas ar fi verificarea daca directorul curent se termina cu numele utilizatorului
    @Step
    public void should_see_username(String username)   {
        //am folosit urmatoarea linie in debug pentru a vedea
        //daca utilizatorul caruia i se cere parola e cel introdus

        String s=accountPage.get_currentUser();
        assertTrue(accountPage.get_currentUser().contains (username));

    }

    //un alt pas e cel in care utilizatorul se delogheaza
    @Step
    public void click_logout() {
        accountPage.click_logout();
    }



}