package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

@DefaultUrl("https://signin.ebay.com")
public class SignInPage extends PageObject {
    @FindBy(css = "#userid")
    WebElementFacade userInput;

    @FindBy(css = "#pass")
    WebElementFacade passwordInput;

    @FindBy(css = "#sgnBt")
    WebElementFacade signIn;


    @Step("Given a traveller has a frequent flyer account with {0} points")
    public void open_login_page() {
        open();
    }

    @Step("When test data")
    public MainPage fill_in_user_and_password(String username, String password) {
        userInput.type(username);
        passwordInput.type(password);
        signIn.click();
        return new MainPage();
    }
}