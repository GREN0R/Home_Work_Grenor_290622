package PageObject_1.Holders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DriverHolder{

    protected WebDriver driver;

    public DriverHolder(WebDriver driver){
        this.driver = driver;

    }

    public DriverHolder goToHomePage(){
        driver.get("https://www.amazon.com/");
        return new DriverHolder(driver);
    }

    protected WebElement getElementByXpath(String xpath){
        return (new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))));
    }

    protected List <WebElement> getElementsByXpath(String xpath){
        return (new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))));
    }

}