package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

@DefaultUrl("https://www.ebay.com/")
public class MainPage extends PageObject {
    @FindBy(css = "#gh-ug")
    WebElementFacade userName;

    @Step("Then")
    public void should_Login_With_Valid_Data() {
        assertThat(userName.getText(),
                containsString("Andrii") );
    }
}
