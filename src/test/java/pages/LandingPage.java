package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

    WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='My Learning']")
    WebElement myLearningTab;

    @FindBy(xpath = "//button[contains(@class,'user-pill') and .//span[normalize-space()='Menu']]")
    WebElement logoutMenu;

    @FindBy(xpath = "//button[contains(@class,'nav-dropdown-item') and .//span[normalize-space()='Logout']]")
    WebElement logoutButton;


    @FindBy(xpath = "//button[contains(@class,'nav-dropdown-trigger') and .//span[normalize-space()='Learn']]")
    WebElement learnTab;

    @FindBy(xpath = "//button[contains(@class,'nav-dropdown-item') and .//span[normalize-space()='Learning Materials']]")
    WebElement learningMaterialsDropdown;



    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyLoginSuccess() {
        myLearningTab.isDisplayed();
    }

    public void clickLogoutMenu() {
        logoutMenu.click();
    }

    public void clickLogoutButton() {logoutButton.click();}

    public void clickLearnTab() {
        learnTab.click();
    }

    public void selectLearningMaterials() {
        learningMaterialsDropdown.click();
    }

}
