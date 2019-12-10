package wagwalking;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SecondTest extends BaseTest {

    @Test
    public void testSecond(){


        WebElement bookFirstWalkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.yeXEn"));
        bookFirstWalkFreeButton.click();

        List<WebElement> inputFields = driver.findElements(By.cssSelector("input"));

        inputFields.get(0).sendKeys("Test@test.com");
        inputFields.get(1).sendKeys("1231223");
        inputFields.get(2).sendKeys("Doug");
        inputFields.get(3).sendKeys("Big");
        inputFields.get(4).sendKeys("243-234-1212");














    }


}
