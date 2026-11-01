package tests;

import org.testng.annotations.Test;

import  static utils.ReadData.username;
import static utils.ReadData.password;
import static utils.ReadData.address;
import static utils.ReadData.discountCode;
import static utils.ReadData.deviceTpe;
import static utils.ReadData.brand;
import static utils.ReadData.color;
import static utils.ReadData.quantity;

public class PurchaseFlowTests extends Base {

    @Test
    public void testNavigateToLearningMaterials() throws InterruptedException {

        homepage.clickLoginButton();
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginSubmitButton();
        landingPage.verifyLoginSuccess();
        landingPage.clickLearnTab();
        landingPage.selectLearningMaterials();
    }

    @Test(dependsOnMethods = {"testNavigateToLearningMaterials"})
    public void testDevicePurchase() throws InterruptedException {
        learningMaterialsPage.clickWebAutomationAdvanceTab();
        learningMaterialsPage.firstSegmentOfPurchase(deviceTpe,brand,color,quantity,address);
        takeScreenshots.takeSnapShot(driver, "First part of purchase");
        learningMaterialsPage.secondSegmentOfPurchase(discountCode);
        takeScreenshots.takeSnapShot(driver, "Second part of purchase");
    }


}
