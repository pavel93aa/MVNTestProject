package MVNTestProjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePageFactory {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(@data-id, 'market')]")
    private WebElement MARKET_LINK;

    @FindBy(xpath = "//a[contains(@href, '/catalog--elektronika/54440')]")
    private WebElement ELEKTRONIKA_LINK;

    @FindBy(xpath = "//a[contains(@href, '/catalog--mobilnye-telefony/54726/list?catId=91491&hid=91491')]")
    private WebElement MOBILNYE_TELEFONY_LINK;

    @FindBy(xpath = "//a[contains(@href, '/catalog--naushniki-i-bluetooth-garnitury/56179/list?catId=90555&hid=90555')]")
    private WebElement NAUSHNIKI_I_BLUETOOTH_GARNITURY_LINK;

    @FindBy(xpath = "//a[contains(@href, '/catalog/54726/list?hid=91491&glfilter=7893318%3A153043')]")
    private WebElement APPLE_CHECKBOX_LINK;

    @FindBy(xpath = "//a[contains(@href, 'catalog/56179/list?hid=90555&glfilter=7893318%3A8455647')]")
    private WebElement BEATS_CHECKBOX_LINK;

    @FindBy(xpath = "//input[contains(@id, 'glpricefrom')]")
    private WebElement PRICE_FROM_TEXT_FIELD;

    @FindBy(xpath = "//input[contains(@id, 'glpriceto')]")
    private WebElement PRICE_TO_TEXT_FIELD;

    @FindBy(xpath = "/html/body/div[1]/div[5]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[3]/div[2]/a")
    private WebElement FIRST_LINK;

    @FindBy(xpath = "//div[contains(@data-id, 'model-1732181846')]/a")
    private WebElement APPLE_NAME_OUTER;

    @FindBy(xpath = "//*[contains(@class, 'title title_size_28 title_bold_yes')]")
    private WebElement APPLE_NAME_INNER;

    @FindBy(xpath = "//div[contains(@data-id, 'model-1713772584')]/a")
    private WebElement BEATS_NAME_OUTER;

    @FindBy(xpath = "//*[contains(@class, 'title title_size_28 title_bold_yes')]")
    private WebElement BEATS_NAME_INNER;

    public WebElement getAPPLE_NAME_OUTER() {
        return APPLE_NAME_OUTER;
    }

    public WebElement getAPPLE_NAME_INNER() {
        return APPLE_NAME_INNER;
    }

    public WebElement getBEATS_NAME_OUTER() {
        return BEATS_NAME_OUTER;
    }

    public WebElement getBEATS_NAME_INNER() {
        return BEATS_NAME_INNER;
    }

    public void openMainPage() {
        getDriver().get("https://yandex.ru/");
        System.out.println(getDriver().getCurrentUrl());
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

    public void clickNaushnikiIBluetoothGarnitury() {
        NAUSHNIKI_I_BLUETOOTH_GARNITURY_LINK.click();
        System.out.println("Левый клик мыши на ссылке \"Наушники и Bluetooth-гарнитуры\"");
    }

    public void clickAppleCheckbox() {
        APPLE_CHECKBOX_LINK.click();
        System.out.println("Левый клик мыши на чекбоксе \"Apple\"");
    }

    public void clickBeatsCheckbox() {
        BEATS_CHECKBOX_LINK.click();
        System.out.println("Левый клик мыши на чекбоксе \"Beats\"");
    }

    public void selectTextFieldFrom() {
        PRICE_FROM_TEXT_FIELD.click();
        System.out.println("Левый клик мыши на текстовом поле \"Цена от\"");
    }

    public void textInputFrom(String text) {
        PRICE_FROM_TEXT_FIELD.clear();
        PRICE_FROM_TEXT_FIELD.sendKeys(text);
        System.out.println("Очистка и ввод текста в текстовое поле \"Цена от\"");
    }

    public void selectTextFieldTo() {
        PRICE_TO_TEXT_FIELD.click();
        System.out.println("Левый клик мыши на текстовом поле \"Цена до\"");
    }

    public void textInputTo(String text) {
        PRICE_TO_TEXT_FIELD.clear();
        PRICE_TO_TEXT_FIELD.sendKeys(text);
        System.out.println("Очистка и ввод текста в текстовое поле \"Цена до\"");
    }

    public void clickFirstLink() {
        FIRST_LINK.click();
        System.out.println("Левый клик мыши по первой ссылке");
    }
}
