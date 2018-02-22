package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

@DefaultUrl("https://signin.ebay.com")
public class LoginPage extends PageObject {

    @Step("Given a traveller has a frequent flyer account with {0} points")
    public void open_login_page() {
        open();
    }

    @Step("When test data")
    public void fill_in_user_and_password(String username, String password) {
        $("#userid").type(username);
        $("#pass").type(password);
        $("#sgnBt").click();
    }

    @Step("Then")
    public void should_Login_With_Valid_Data() {
        $("#gh-ug").getText().contains("Andrii");
    }
}