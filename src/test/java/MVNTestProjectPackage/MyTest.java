package MVNTestProjectPackage;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class MyTest extends ChromeDriverSettings {

    @Test //Проверка заголовка страницы
    public void Test1() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);

        System.out.println("Шаг 1: Открыть сайт");
        mainPage.openMainPage();

        System.out.println("Шаг 2: Проверить заголовок");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.equals("Яндекс"));
    }

    @Test //Проверка поиска информации
    public void Test2() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);

        System.out.println("Шаг 1: Открыть сайт");
        mainPage.openMainPage();

        System.out.println("Шаг 2: Ввести текст");
        mainPage.textInput("selenium");

        System.out.println("Шаг 3: Нажать на поиск");
        mainPage.pressSearch();
        Thread.sleep(3000);
    }

    @Test //Переход по ссылке
    public void Test3() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);

        System.out.println("Шаг 1: Открыть сайт");
        mainPage.openMainPage();

        System.out.println("Шаг 2: Перейти по ссылке");
        mainPage.pressLinkImages();
        Thread.sleep(3000);
    }
}
