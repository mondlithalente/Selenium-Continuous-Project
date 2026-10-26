package tests;

import org.testng.annotations.Test;

public class PurchaseFlowTests extends Base {

    @Test
    public void testNavigateToLearningMaterials() throws InterruptedException {

        homepage.clickLoginButton();
        loginPage.loginAs();
        Thread.sleep(1500);
        landingPage.clickLearnTab();
        Thread.sleep(1200);
        landingPage.selectLearningMaterials();
    }

    @Test(dependsOnMethods = {"testNavigateToLearningMaterials"})
    public void testDevicePurchase() throws InterruptedException {
        learningMaterialsPage.clickWebAutomationAdvanceTab();
        learningMaterialsPage.firstSegmentOfPurchase("Phone", "Apple", "Blue", "2", "Selenium Street");
        Thread.sleep(2000);
        takeScreenshots.takeSnapShot(driver, "First part of purchase");
        learningMaterialsPage.secondSegmentOfPurchase("SAVE10");
        Thread.sleep(2000);
        takeScreenshots.takeSnapShot(driver, "Second part of purchase");
    }


}
