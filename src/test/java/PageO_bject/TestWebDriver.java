package PageO_bject;

import org.testng.annotations.Test;

public class TestWebDriver extends TestInit {
    @Test
    public void runGoogle() {
        goToGoogle();
        getSearchField().sendKeys("soundcloud\n");
        soundcloud().click();
        acceptsoundcloud().click();
        searchSoundcloud().sendKeys("Grenor\n");
    }
}