package PageObject.PageObjects;

import PageObject.Holders.DriverHolder;
import org.openqa.selenium.WebDriver;

public class AmazonSearchResultPageElements extends DriverHolder {

    public AmazonSearchResultPageElements(WebDriver driver){
        super(driver);

    }

    private String firstSearchResult = "//span[contains(text(), '75252')]";
    public WebDriver getFirstSearchResult(){
        return (WebDriver) getElementByXpath(firstSearchResult);

    }

}