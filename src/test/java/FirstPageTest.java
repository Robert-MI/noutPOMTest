import constants.AssertionMessages;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstPageTest extends BaseTest{
    @Test
    public void testElectronicsButton(){
        firstPage.clickElectronicsButton();
        Assert.assertEquals(driver.getCurrentUrl(), AssertionMessages.EXPECTED_ELECTRONICS_URL);
    }
}
