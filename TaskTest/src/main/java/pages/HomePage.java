package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @FindBy(css = ".header_profile")
    private WebElement loginButton;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(css = ".btn")
    private WebElement emailButton;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(css = ".btn.auth-btn")
    private WebElement passwordButton;

    @FindBy(css = ".notification__info")
    private WebElement okMessage;

    @FindBy(css = ".btn.auth-btn")
    private WebElement errorEmail;

    @FindBy(css = ".auth_title")
    private WebElement errorPassword;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(this.driver, this);
    }

    public HomePage clickLoginButton() {
        loginButton.click();
        return new HomePage(driver);
    }

    public HomePage clickEmailButton() {
        emailButton.click();
        return new HomePage(driver);
    }

    public HomePage clickPasswordButton() {
        passwordButton.click();
        return new HomePage(driver);
    }

    public HomePage enterEmail(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
        return this;
    }

    public HomePage enterPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
        return this;
    }

    public String getOkMessage() {
        waitUntilPageIsLoaded(okMessage);
        return okMessage.getText();
    }

    public String getErrorEmailMessage() {
        waitUntilPageIsLoaded(errorEmail);
        return errorEmail.getText();
    }

    public String getErrorPasswordMessage() throws InterruptedException {
        Thread.sleep(1000);
        waitUntilPageIsLoaded(errorPassword);
        return errorPassword.getText();
    }

    public HomePage waitUntilPageIsLoaded(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return this;
    }
}
