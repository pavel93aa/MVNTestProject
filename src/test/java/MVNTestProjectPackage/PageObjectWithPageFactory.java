package MVNTestProjectPackage;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/*Данный класс пока что не работает*/

public class PageObjectWithPageFactory {

    public ChromeDriver driver;
    public PageObjectWithPageFactory page;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavel\\SeleniumDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Test setUp");
    }

    @After
    public void cleanUp() {
        if (driver != null) {
            driver.quit();
            System.out.println("Test cleanUp");
        }
    }

    @FindBy(xpath = "//*[@id=\"text\"]")
    WebElement TEXT1;


    public PageObjectWithPageFactory() {

    }

    public PageObjectWithPageFactory(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openYandex() {
        driver.get("https://yandex.ru/");
        System.out.println(driver.getCurrentUrl());
    }

/*    public void search() {
        driver.findElement(By.xpath(TEXT1)).click();
        driver.findElement(By.xpath(TEXT1)).clear(); //Очистить поле
        driver.findElement(By.xpath(TEXT1)).sendKeys("selenium");
        driver.findElement(By.className("search2__button")).click(); //Левый клик мыши
    }*/


}
