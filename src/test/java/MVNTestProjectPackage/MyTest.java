package MVNTestProjectPackage;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class MyTest extends ChromeDriverSettings {

    public static final String SEARCH = "//*[@id=\"page\"]/div[1]/header/nav/div/div/form/a/i";
    public static final String SE_IN_JAVA = "//*[@id=\"content\"]/div[1]/div/div/div/div[3]/div[1]/div/div/div/div/p/a/img";

    @Test
    public void Test1() throws InterruptedException {

        driver.get("https://www.toolsqa.com/");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.equals("QA Automation Tools Tutorial"));
        driver.findElement(By.xpath(SEARCH)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(SE_IN_JAVA)).click();
        Thread.sleep(3000);
    }
}
