package MVNTestProjectPackage;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {
    @Test
    public void Test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavel\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/");
        //driver.quit();
    }
}
