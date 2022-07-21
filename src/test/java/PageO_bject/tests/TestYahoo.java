package PageO_bject.tests;

import PageO_bject.pageObjects.YahooHomePage;
import org.testng.annotations.Test;

public class TestYahoo extends TestInit{

    @Test
    public void clickEnterBtn(){
        goToYahoo();
        YahooHomePage yahooHomePage = new YahooHomePage(driver);
        yahooHomePage.getEnterBtn().click();
//        driver.get("https//www.yahoo.com/");
    }
    @Test
    public void clickEnterBtn2(){
        driver.get("https://www.bing.com");
        YahooHomePage yahooHomePage = new YahooHomePage(driver);
        yahooHomePage.getEnterBtn().click();
    }
}
