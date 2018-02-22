package tests;

        import net.serenitybdd.junit.runners.SerenityRunner;
        import net.thucydides.core.annotations.Steps;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import pages.SignInPage;


@RunWith(SerenityRunner.class)
public class LoginTests extends BaseTest {
    @Steps
    SignInPage signInPage;

    @Test
    public void loginWithValidCredentials() {
        String username = "andrewdavies80@yahoo.com";
        String password = "vf281992";
        //Given
        signInPage.open_login_page();
        signInPage.fill_in_user_and_password(username, password)
                .should_Login_With_Valid_Data();
    }
}
