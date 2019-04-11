package MVNTestProjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

/*Данный класс пока что не работает*/

public class PageObjectWithPageFactory {

    WebDriver driver;

    public static final String SEARCH = "//*[@id=\"page\"]/div[1]/header/nav/div/div/form/a/i";

    public PageObjectWithPageFactory(ChromeDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"page\"]/div[1]/header/nav/div/div/form/a/i")
    WebElement SEARCH1;
}
