import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest  {
    @Managed(driver="firefox")
    WebDriver driver;

}
