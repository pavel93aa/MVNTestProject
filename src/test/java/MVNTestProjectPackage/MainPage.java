package MVNTestProjectPackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends ChromeDriverSettings {

    MainPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"text\"]")
    private WebElement TEXT_FIELD_ON_THE_MAIN_PAGE;

    @FindBy(className = "search2__button")
    private WebElement SEARCH_BUTTON;

    //Не находит кнопку по xpath
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div[2]/div/fdpprt/fdpprt/dhtaq/div/div[2]/div/div[2]/div/form/div[2]")
    private WebElement SEARCH_BUTTON1;

    //Открыть главную страницу
    public void openMainPage() {
        driver.get("https://yandex.ru/");
        System.out.println(driver.getCurrentUrl());
    }

    //Ввести текст в текстовое поле
    public void textInput(String text) {
        TEXT_FIELD_ON_THE_MAIN_PAGE.click();
        TEXT_FIELD_ON_THE_MAIN_PAGE.clear();
        TEXT_FIELD_ON_THE_MAIN_PAGE.sendKeys(text);
    }

    //Левый клик мыши на кнопке поиска
    public void pressSearch() {
        SEARCH_BUTTON.click();
    }

    //Нажать Enter
    public void pressEnter() {
        TEXT_FIELD_ON_THE_MAIN_PAGE.sendKeys(Keys.RETURN);
    }
}
