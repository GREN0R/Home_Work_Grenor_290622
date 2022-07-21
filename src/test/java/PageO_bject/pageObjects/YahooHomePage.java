package PageO_bject.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YahooHomePage extends BasePage{

    public YahooHomePage(WebDriver driver) {
        super(driver);
    }
        public WebElement getSearchField() {
            return driver.findElement(By.xpath("//input[@name='q']"));
    }

    public WebElement getEnterBtn() {
        return driver.findElement(By.xpath("//*[@id=\"ybar-inner-wrap\"]/div[3]/div/div[3]/div[1]/div/a"));
    }
}
