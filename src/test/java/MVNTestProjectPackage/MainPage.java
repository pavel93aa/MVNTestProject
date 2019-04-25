package MVNTestProjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends ChromeDriverSettings {

    MainPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(@data-id, 'market')]")
    private WebElement MARKET_LINK;

    @FindBy(xpath = "//a[contains(@href, '/catalog--elektronika/54440')]")
    private WebElement ELEKTRONIKA_LINK;

    @FindBy(xpath = "//a[contains(@href, '/catalog--mobilnye-telefony/54726/list?catId=91491&hid=91491')]")
    private WebElement MOBILNYE_TELEFONY_LINK;

    @FindBy(xpath = "//a[contains(@href, '/catalog/54726/list?hid=91491&glfilter=7893318%3A153043')]")
    private WebElement APPLE_CHECKBOX_LINK;

    @FindBy(xpath = "//input[contains(@id, 'glpricefrom')]")
    private WebElement PRICE_FROM_TEXT_FIELD;

    public void openMainPage() {
        driver.get("https://yandex.ru/");
        System.out.println(driver.getCurrentUrl());
    }

    public void clickMarket() {
        MARKET_LINK.click();
        System.out.println("Левый клик мыши на ссылке \"Маркет\"");
    }

    public void clickElektronika() {
        ELEKTRONIKA_LINK.click();
        System.out.println("Левый клик мыши на ссылке \"Электроника\"");
    }

    public void clickMobilnyeTelefony() {
        MOBILNYE_TELEFONY_LINK.click();
        System.out.println("Левый клик мыши на ссылке \"Мобильные телефоны\"");
    }

    public void clickAppleCheckbox() {
        APPLE_CHECKBOX_LINK.click();
        System.out.println("Левый клик мыши на чекбоксе \"Apple\"");
    }

    public void selectTextField() {
        PRICE_FROM_TEXT_FIELD.click();
        System.out.println("Левый клик мыши на текстовом поле \"Цена от\"");
    }

    public void textInput(String text) {
        PRICE_FROM_TEXT_FIELD.clear();
        PRICE_FROM_TEXT_FIELD.sendKeys(text);
        System.out.println("Очистка и ввод текста в текстовое поле \"Цена от\"");
    }
}
