package tests;

import org.testng.annotations.Test;

public class PurchaseFlowTests extends Base {

    @Test
    public void testNavigateToLearningMaterials() throws InterruptedException {

        homepage.clickLoginButton();
        loginPage.loginAs();
        landingPage.verifyLoginSuccess();
        landingPage.clickLearnTab();
        landingPage.selectLearningMaterials();
    }

    @Test(dependsOnMethods = {"testNavigateToLearningMaterials"})
    public void testDevicePurchase() throws InterruptedException {
        learningMaterialsPage.clickWebAutomationAdvanceTab();
        learningMaterialsPage.firstSegmentOfPurchase("Phone", "Apple", "Blue", "2", "Selenium Street");
        takeScreenshots.takeSnapShot(driver, "First part of purchase");
        learningMaterialsPage.secondSegmentOfPurchase("SAVE10");
        takeScreenshots.takeSnapShot(driver, "Second part of purchase");
    }


}
