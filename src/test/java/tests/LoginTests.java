package tests;

import org.testng.annotations.Test;

public class LoginTests extends Base {

    @Test
    public void validLoginTest() throws InterruptedException {
        takeScreenshots.takeSnapShot(driver, "BeforeLogin");
        homepage.clickLoginButton();
        loginPage.loginAs();
        Thread.sleep(4000);
        landingPage.verifyLoginSuccess();
        Thread.sleep(1500);
        takeScreenshots.takeSnapShot(driver, "AfterLogin");

    }

    //ToDo: Add logOut functionality test

    @Test(dependsOnMethods = {"validLoginTest"})
    public void logoutTest() throws InterruptedException{
        landingPage.clickLogoutMenu();
        Thread.sleep(1500);
        landingPage.clickLogoutButton();
    }

    @Test
    public void invalidLoginTest() throws InterruptedException {
        homepage.clickLoginButton();
        loginPage.enterUsername("trenchkid200603@gmail.com");
        loginPage.enterPassword("Test123");
        loginPage.clickLoginSubmitButton();
        takeScreenshots.takeSnapShot(driver, "InvalidLogin");

    }



}
