package PageO_bject.tests;
import PageO_bject.pageObjects.GoogleHomePage;
import org.testng.annotations.Test;

public class TestWebDriver extends TestInit {

    @Test
    public void runGoogle() {
        goToGoogle();
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.getSearchField().sendKeys("dogs\n");
        googleHomePage.getSearchField().click();
    }
    @Test
    public void clickEnterBtn(){
        goToGoogle();
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.getEnterBtn().click();

//        getSearchField().sendKeys("soundcloud\n");
//        soundcloud().click();
//        acceptsoundcloud().click();
//        searchSoundcloud().sendKeys("Grenor\n");
    }
}