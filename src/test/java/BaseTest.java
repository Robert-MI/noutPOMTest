import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;

import pages.FirstPage;

public class BaseTest{
    public static final String BASE_URL = "https://nout.am/am/";
    public static final String WEBDRIVER = "webdriver.geco.driver";
    public static final String DRIVER_PATH = "src/drivers/gecodriver";
    public WebDriver driver;
    public FirstPage firstPage;

    @BeforeClass
    public void setUp(){
        System.setProperty(WEBDRIVER,DRIVER_PATH);
        driver =  new FirefoxDriver();
        driver.manage().window().maximize();
        moveToLoginPage();
    }

    @BeforeMethod
    public void moveToLoginPage(){
        driver.get(BASE_URL);
        firstPage = new FirstPage(driver);
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus())
        {
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try{
                Files.move(screenshot, new File("src/screenshots/" +  result.getName() + ".png"));
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
