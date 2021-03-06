package test;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@id, 'idcta-username')]")
    private WebElement singIn;

    @FindBy(xpath = "//*[contains(@id, 'user-identifier-input')]")
    private WebElement loginField;

    @FindBy(xpath = "//*[contains(@id, 'password-input')]")
    private WebElement passwdField;

    @FindBy(xpath = "//*[contains(@id,  'submit-button')]")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[contains(@id,  'idcta-username')]")
    private WebElement yourAccount;

    @FindBy(xpath = "//span[text()='Register now']")
    private WebElement registerNow;

    @FindBy(xpath = "//span[text()='16 or over']")
    private WebElement OrOver;

    @FindBy(xpath = "//*[contains(@id,  'day-input')]")
    private WebElement dayInput;

    @FindBy(xpath = "//*[contains(@id,  'month-input')]")
    private WebElement monthInput;

    @FindBy(xpath = "//*[contains(@id,  'year-input')]")
    private WebElement yearInput;

    @FindBy(xpath = "//*[contains(@id,  'submit-button')]")
    private WebElement submitButton;

    @FindBy(xpath = "//*[contains(@id,  'user-identifier-input')]")
    private WebElement userIdentifierInput;

    @FindBy(xpath = "//*[contains(@id,  'password-input')]")
    private WebElement passwordInput;


    @Step("loginField sendKeys")
    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }
    @Step("passwdField sendKeys")
    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd);
    }
    @Step("singIn click")
    public void clickSingIn() {
        singIn.click();
    }
    @Step("loginBtn click")
    public void clickLoginBtn() {
        loginBtn.click();
    }
    @Step("loginField click()")
    public void clickLoginField() {
        loginField.click();
    }
    @Step("passwdField.click")
    public void clickPasswdField() {passwdField.click();}
    @Step("yourAccount click")
    public void clickYourAccount() {yourAccount.click();}
    @Step("registerNow click")
    public void clickRegisterNow() {registerNow.click();}
    @Step("dayInput sendKeys")
    public void dayInput(String day) {dayInput.sendKeys(day);}
    @Step("monthInput sendKeys")
    public void monthInput(String month) {monthInput.sendKeys(month);}
    @Step("yearInput sendKeys")
    public void yearInput(String year) {yearInput.sendKeys(year);}
    @Step("userIdentifierInput sendKeys")
    public void userIdentifierInput(String login) {userIdentifierInput.sendKeys(login);}
    @Step("OrOver click")
    public void clickOrOver() {OrOver.click();}
    @Step("submitButton click ")
    public void clickSubmitButton() {submitButton.click();}
    @Step("passwordInput sendKeys")
    public void PasswordInput(String password) {passwordInput.sendKeys(password);}
}
