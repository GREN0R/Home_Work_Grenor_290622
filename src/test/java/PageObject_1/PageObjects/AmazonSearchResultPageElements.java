package PageObject_1.PageObjects;

import PageObject_1.Holders.DriverHolder;
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