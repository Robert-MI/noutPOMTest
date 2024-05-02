import constants.AssertionMessages;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{
    @Test
    public void testElectronicsButton(){
        homePage.clickElectronicsButton();
        Assert.assertEquals(driver.getCurrentUrl(), AssertionMessages.EXPECTED_ELECTRONICS_URL);
    }
}
