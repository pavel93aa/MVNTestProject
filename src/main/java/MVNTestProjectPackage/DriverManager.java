/*Класс DriverManager содержит  метод createWebDriver() без тела и метод getWebDriver()*/

package MVNTestProjectPackage;

import org.openqa.selenium.WebDriver;

abstract public class DriverManager {

    protected WebDriver driver;

    protected abstract void createWebDriver();

    public WebDriver getWebDriver() {

        createWebDriver();

        return driver;
    }
}
