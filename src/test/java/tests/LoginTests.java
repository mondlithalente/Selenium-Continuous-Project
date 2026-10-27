package tests;

import org.testng.annotations.Test;
import utils.ReadData;

import static utils.ReadData.username;

import static utils.ReadData.password;


public class LoginTests extends Base {

    @Test
    public void validLoginTest() throws InterruptedException {
        takeScreenshots.takeSnapShot(driver, "BeforeLogin");
        homepage.clickLoginButton();
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginSubmitButton();
        landingPage.verifyLoginSuccess();
        takeScreenshots.takeSnapShot(driver, "AfterLogin");

    }

    //ToDo: Add logOut functionality test

    @Test(dependsOnMethods = {"validLoginTest"})
    public void logoutTest() throws InterruptedException {
        landingPage.clickLogoutMenu();
        landingPage.clickLogoutButton();
    }

//    @Test
//    public void invalidLoginTest() throws InterruptedException {
//        homepage.clickLoginButton();
//        loginPage.enterUsername("trenchkid200603@gmail.com");
//        loginPage.enterPassword("Test123");
//        loginPage.clickLoginSubmitButton();
//        takeScreenshots.takeSnapShot(driver, "InvalidLogin");
//
//    }


}
