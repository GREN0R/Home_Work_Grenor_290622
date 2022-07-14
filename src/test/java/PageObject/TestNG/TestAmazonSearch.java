package PageObject.TestNG;

import PageObject.Holders.TestInit;
import PageObject.PageObjects.AmazonHomePageHelper;
import org.testng.annotations.Test;

public class TestAmazonSearch extends TestInit {

    @Test
    public void amazon(){
        AmazonHomePageHelper amazonPageHelper = new AmazonHomePageHelper(driver);
        amazonPageHelper.goToHomePage();
        amazonPageHelper.searchItem("lego");



    }
}