package PageObject_1.PageObjects;

import org.openqa.selenium.WebDriver;

public class AmazonHomePageHelper extends AmazonHomePageElements {

    public AmazonHomePageHelper(WebDriver driver){
        super(driver);

    }
    public void searchItem(String item){
        getSearchField().clear();
        getSearchField().sendKeys(item);
        getSearchButton().click();
    }

}