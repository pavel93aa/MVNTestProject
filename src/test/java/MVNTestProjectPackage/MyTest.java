package MVNTestProjectPackage;

import org.junit.Assert;
import org.junit.Test;

public class MyTest extends ChromeDriverSettings {

    @Test
    public void Test1() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();

        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.equals("Яндекс"));

        mainPage.textInput("selenium");
        mainPage.pressSearch();
        Thread.sleep(3000);
    }
}
