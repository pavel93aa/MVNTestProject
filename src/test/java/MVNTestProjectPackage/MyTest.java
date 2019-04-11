package MVNTestProjectPackage;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MyTest extends ChromeDriverSettings {

    public static final String TEXT = "//*[@id=\"text\"]";
    public static final String SEARCH_BUTTON = "/html/body/div[1]/div[3]/div[2]/div[2]/div/dhtaq/edvrt/ftgr/div/div[2]/div/div[2]/div/form/div[2]/button";

    @Test
    public void Test1() throws InterruptedException {

        driver.get("https://yandex.ru/");
        System.out.println(driver.getCurrentUrl());
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.equals("Яндекс"));
        driver.findElement(By.xpath(TEXT)).click();
        driver.findElement(By.xpath(TEXT)).clear(); //Очистить поле
        driver.findElement(By.xpath(TEXT)).sendKeys("selenium");
        driver.findElement(By.className("search2__button")).click(); //Левый клик мыши
        //driver.findElement(By.xpath(TEXT)).sendKeys(Keys.RETURN); //Нажать ENTER
        //driver.findElement(By.xpath(SEARCH_BUTTON)).click(); //Разобраться почему не находит элемент
        Thread.sleep(3000);
    }
}
