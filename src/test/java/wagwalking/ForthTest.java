package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ForthTest extends BaseTest {

    @Test
    public void testForht(){

        WebElement bookFirstWalkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.yeXEn"));
        bookFirstWalkFreeButton.click();

        List<WebElement> inputFields = driver.findElements(By.cssSelector("input"));

        inputFields.get(0).sendKeys(clientError.getEmail());
        inputFields.get(1).click();

        List<WebElement> errorMailFields = driver.findElements(By.cssSelector(".sc-bdVaJa.sc-iwsKbI.kOShw"));
        Assert.assertEquals("please provide a valid email", errorMailFields.get(0).getText());

    }

}
