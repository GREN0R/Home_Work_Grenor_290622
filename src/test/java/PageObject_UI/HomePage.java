package PageObject_UI;

import jdk.internal.access.JavaIOFileDescriptorAccess;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HomePage {
    @Test
    public void wrongPasswordLoginTest(JavaIOFileDescriptorAccess driver) {
        driver.get("https://lingualeo.com");
        driver.findElement(By.id("login")).sendKeys("admin");
        driver.findElement(By.id("pass")).sendKeys("admin");
        assertEquals( actual: "Something went wrong...",driver.getTitle());
    }
}
