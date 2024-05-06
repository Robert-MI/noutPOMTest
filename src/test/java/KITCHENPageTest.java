import constants.AssertionMessages;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ElectronicsPage;
import pages.KITCHENPage;

public class KITCHENPageTest extends BaseTest{
    @Test
    public void testListSize(){
        ElectronicsPage electronicsPage = homePage.clickElectronicsButton();
        KITCHENPage KITCHENPage = electronicsPage.clickTVButton();
        int actualListSize = KITCHENPage.linkListSize();
        Assert.assertTrue(actualListSize <= AssertionMessages.EXPECTED_LIST_KITCHEN_SIZE);
    }

    @Test
    public void testToBasePageButton(){
        ElectronicsPage electronicsPage = homePage.clickElectronicsButton();
        KITCHENPage KITCHENPage = electronicsPage.clickTVButton();
        KITCHENPage.clickToBasePage();
        Assert.assertEquals(driver.getCurrentUrl(), AssertionMessages.EXPECTED_BASE_URL);
    }
}
