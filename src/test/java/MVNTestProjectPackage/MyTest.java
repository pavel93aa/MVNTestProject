package MVNTestProjectPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavel\\IdeaProjects\\MVNTestProject\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Test setUp");
    }

    @After
    public void cleanUp() {
        if (driver != null) {
            driver.quit();
            System.out.println("Test cleanUp");
        }
    }

    @Test
    public void yandexTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        //Зайти на yandex.ru
        mainPage.openMainPage();
        //Перейти в маркет, подраздел электроника, мобильные телефоны
        mainPage.clickMarket();
        Thread.sleep(3000);
        mainPage.clickElektronika();
        Thread.sleep(3000);
        mainPage.clickMobilnyeTelefony();
        Thread.sleep(3000);
        //Сделать фильтрацию по телефонам марки Apple
        mainPage.clickAppleCheckbox();
        Thread.sleep(3000);
        //Сделать фильтр по цене от 60 000 рублей
        mainPage.selectTextField();
        mainPage.textInput("60000");
        Thread.sleep(3000);
        //Перейти по ссылке первого телефона в его описание
        driver.findElement(By.xpath("//a[text()= 'Смартфон Apple iPhone X 64GB']")).click();
        Thread.sleep(3000);
    }
}
