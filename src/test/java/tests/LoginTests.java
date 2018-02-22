package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import pages.LoginPage;
import tests.BaseTest;


@RunWith(SerenityRunner.class)
public class LoginTests extends BaseTest {
    @Steps
    LoginPage loginPage;

    @Test
    public void loginWithValidCredentials() {
        String username = "andrewdavies80@yahoo.com";
        String password = "vf281992";
        //@GIVEN
        loginPage.open_login_page();

        // WHEN -- TEST DATA
        loginPage.fill_in_user_and_password(username, password);

        // THEN - ASSERT
       loginPage.should_Login_With_Valid_Data();
    }
}
