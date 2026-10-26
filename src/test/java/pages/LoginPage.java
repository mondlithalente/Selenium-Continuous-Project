package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "login-email")
    WebElement usernameField;

    @FindBy(id = "login-password")
    WebElement passwordField;

    @FindBy(id = "login-submit")
    WebElement loginSubmitButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginSubmitButton() {
        loginSubmitButton.click();
    }

    //I am going to call this method in any Workflow since it's just simple login (initial start of any test)
    public void loginAs(){

        enterUsername("trenchkid200603@gmail.com");
        enterPassword("Test123?");
        clickLoginSubmitButton();
    }

}
