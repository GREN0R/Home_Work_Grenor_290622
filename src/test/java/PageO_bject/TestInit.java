package PageO_bject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
//        driver.quit();
    }

    public void sleep(int s) {
        try {
            Thread.sleep(s * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void goToGoogle() {
        driver.get("https://www.google.com.ua/");
    }

    public WebElement getSearchField() {
        return driver.findElement(By.xpath("//input[@name='q']"));
    }

    public WebElement soundcloud() {
        return driver.findElement(By.xpath("//h3[contains(text(), 'Stream and listen to music online for free with SoundCloud')]"));
    }

    public WebElement searchSoundcloud() {
        return driver.findElement(By.xpath("//input[@name='q']"));
    }
    public WebElement acceptsoundcloud() {
        return driver.findElement(By.xpath("//button[contains(@id, 'onetrust-accept')]"));
    }
}