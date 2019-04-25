package MVNTestProjectPackage;

import org.junit.Test;
import org.openqa.selenium.By;

public class MyTest extends ChromeDriverSettings {

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
