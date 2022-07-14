package PageObject.PageObjects;

import org.openqa.selenium.WebDriver;

public class AmazonSearchResultPageHelper extends AmazonSearchResultPageElements{

    public AmazonSearchResultPageHelper(WebDriver driver){
        super(driver);

    }

    public void selectFirstElement(){
        getFirstSearchResult().close();
    }
}