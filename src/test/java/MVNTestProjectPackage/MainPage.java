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

    @FindBy(xpath = "//div[contains(@class, 'search2__button')]")
    private WebElement SEARCH_BUTTON;

    @FindBy(xpath = "//div/a[contains(@data-id, 'images')]")
    private WebElement LINK_IMAGES;

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

    //Левый клик мыши на ссылке картинки
    public void pressLinkImages() {
        LINK_IMAGES.click();
    }

    //Нажать Enter
    public void pressEnter() {
        TEXT_FIELD_ON_THE_MAIN_PAGE.sendKeys(Keys.RETURN);
    }
}
