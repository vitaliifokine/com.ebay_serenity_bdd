package tests;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public abstract class BaseTest  {
    public final String chrome = "chrome";
    public final String firefox = "firefox";

    @Managed(driver=chrome)
    WebDriver driver;
}
