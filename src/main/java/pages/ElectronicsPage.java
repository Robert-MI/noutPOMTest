package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import constants.LocatorConstants;
import java.time.Duration;
import java.util.List;

public class ElectronicsPage extends BasePage{
    private By TV = By.id(LocatorConstants.TV_ID);
    private By linkList = By.className(LocatorConstants.LINK_LIST_CLASS);

    public ElectronicsPage(WebDriver driver){
        this.driver = driver;
    }

    public TVPage clickTVButton (){
        WebElement button = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(TV));
        button.click();
        return new TVPage(driver);
    }
    public int linkListSize(){
        WebElement list = driver.findElement(linkList);
        List<WebElement> listElements = list.findElements(By.className("category-item"));
        return listElements.size();
    }
}
