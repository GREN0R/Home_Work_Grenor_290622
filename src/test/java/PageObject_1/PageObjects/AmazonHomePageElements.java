package PageObject_1.PageObjects;

import PageObject_1.Holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePageElements extends DriverHolder {
    public AmazonHomePageElements(WebDriver driver){
        super(driver);

    }
    private String searchField = "//input[contains(@type, 'text')]";
    private String searchButton = "//div[contains(@class, 'nav-search-submit')]";
    public WebElement getSearchField(){
        return getElementByXpath(searchField);

    }
    public WebElement getSearchButton(){
        return getElementsByXpath(searchField).get(0);

    }
}