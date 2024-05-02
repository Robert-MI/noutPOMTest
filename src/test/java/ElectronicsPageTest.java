import constants.AssertionMessages;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ElectronicsPage;

public class ElectronicsPageTest extends BaseTest{
    @Test
    public void testTVButton(){
        ElectronicsPage electronicsPage = homePage.clickElectronicsButton();
        electronicsPage.clickTVButton();
        Assert.assertEquals(driver.getCurrentUrl(), AssertionMessages.EXPECTED_TV_URL);
    }

    @Test
    public void testListSize(){
        ElectronicsPage electronicsPage = homePage.clickElectronicsButton();
        int actualListSize = electronicsPage.linkListSize();
        Assert.assertEquals(actualListSize, AssertionMessages.EXPECTED_LIST_SIZE);
    }

    @Test
    public void testToBasePageButton(){
        ElectronicsPage electronicsPage = homePage.clickElectronicsButton();
        electronicsPage.clickToBasePage();
        Assert.assertEquals(driver.getCurrentUrl(), AssertionMessages.EXPECTED_BASE_URL);
    }
}
