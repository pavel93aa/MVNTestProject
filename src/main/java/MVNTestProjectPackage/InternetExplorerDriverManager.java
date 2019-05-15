/*Класс ChromeDriverManager содержит реализацию метода createWebDriver() для IE*/

package MVNTestProjectPackage;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerDriverManager extends DriverManager {

    @Override
    public void createWebDriver() {
        driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
    }
}
