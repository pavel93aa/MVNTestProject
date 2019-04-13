package MVNTestProjectPackage;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverSettings {
    public ChromeDriver driver;

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
}
