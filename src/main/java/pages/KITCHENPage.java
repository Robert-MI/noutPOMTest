package pages;

import constants.LocatorConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class KITCHENPage extends BasePage{
    private By linkList = By.className(LocatorConstants.LINK_LIST_KITCHEN_CLASS);

    public KITCHENPage(WebDriver driver){
        this.driver = driver;
    }

    public int linkListSize(){
        WebElement list = driver.findElement(linkList);
        List<WebElement> listElements = list.findElements(By.className("inStock"));
        return listElements.size();
    }
}
