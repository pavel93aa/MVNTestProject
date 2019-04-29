package MVNTestProjectPackage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavel\\IdeaProjects\\MVNTestProject\\chromedriver.exe");
        //System.setProperty("webdriver.ie.driver", "C:\\Users\\Pavel\\IdeaProjects\\MVNTestProject\\IEDriverServer.exe");
        driver = new ChromeDriver();
        //driver = new InternetExplorerDriver();
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
    public void yandexAppleTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        //Зайти на yandex.ru
        mainPage.openMainPage();
        //Перейти в маркет, подраздел электроника, мобильные телефоны
        mainPage.clickMarket();
        mainPage.clickElektronika();
        mainPage.clickMobilnyeTelefony();
        //Сделать фильтрацию по телефонам марки Apple
        mainPage.clickAppleCheckbox();
        //Сделать фильтр по цене от 60 000 рублей
        mainPage.selectTextFieldFrom();
        mainPage.textInputFrom("60000");
        Thread.sleep(3000);
        //Перейти по ссылке первого телефона в его описание
        String textOuter = mainPage.getAPPLE_NAME_OUTER().getAttribute("title");
        mainPage.clickFirstLink();
        String textInner = mainPage.getAPPLE_NAME_INNER().getText();
        //Сравнить отображаемое имя телефона
        System.out.println(textOuter);
        System.out.println(textInner);
        Assert.assertEquals(textOuter, textInner);
    }

    @Test
    public void yandexBeatsTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        //Зайти на yandex.ru
        mainPage.openMainPage();
        //Перейти в маркет, подраздел электроника, наушники и Bluetooth-гарнитуры
        mainPage.clickMarket();
        mainPage.clickElektronika();
        mainPage.clickNaushnikiIBluetoothGarnitury();
        //Сделать фильтрацию по наушникам марки Beats
        mainPage.clickBeatsCheckbox();
        //Сделать фильтр по цене от 17000 до 25000 рублей
        mainPage.selectTextFieldFrom();
        mainPage.textInputFrom("17000");
        mainPage.selectTextFieldTo();
        mainPage.textInputTo("25000");
        Thread.sleep(3000);
        //Перейти по ссылке первых наушников в их описание
        String textOuter = mainPage.getBEATS_NAME_OUTER().getAttribute("title");
        mainPage.clickFirstLink();
        String textInner = mainPage.getBEATS_NAME_INNER().getText();
        //Сравнить отображаемое имя наушников
        System.out.println(textOuter);
        System.out.println(textInner);
        Assert.assertEquals(textOuter, textInner);
    }
}
