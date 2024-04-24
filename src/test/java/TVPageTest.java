import constants.AssertionMessages;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ElectronicsPage;
import pages.TVPage;

public class TVPageTest extends BaseTest{
    @Test
    public void testListSize(){
        ElectronicsPage electronicsPage = firstPage.clickElectronicsButton();
        TVPage tvPage = electronicsPage.clickTVButton();
        int actualListSize = tvPage.linkListSize();
        Assert.assertEquals(actualListSize, AssertionMessages.EXPECTED_LIST_TV_SIZE);
    }

    @Test
    public void testToBasePageButton(){
        ElectronicsPage electronicsPage = firstPage.clickElectronicsButton();
        TVPage tvPage = electronicsPage.clickTVButton();
        tvPage.clickToBasePage();
        Assert.assertEquals(driver.getCurrentUrl(), AssertionMessages.EXPECTED_BASE_URL);
    }
}
