package PageObject_1.TestNG;

import PageObject_1.Holders.TestInit;
import PageObject_1.PageObjects.AmazonHomePageHelper;
import org.testng.annotations.Test;

public class TestAmazonSearch extends TestInit {

    @Test
    public void amazon(){
        AmazonHomePageHelper amazonPageHelper = new AmazonHomePageHelper(driver);
        amazonPageHelper.goToHomePage();
        amazonPageHelper.searchItem("lego");



    }
}