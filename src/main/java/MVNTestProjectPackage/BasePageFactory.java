package MVNTestProjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageFactory {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    BasePageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
