/*Класс ChromeDriverManager содержит реализацию метода createWebDriver() для CHROME*/

package MVNTestProjectPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {

    @Override
    public void createWebDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
