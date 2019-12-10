package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.logging.Logger;

public class ThirdTest extends BaseTest{

    private static Logger log = Logger.getLogger(ThirdTest.class.getName());



        @Test
        public void testThird(){

            WebElement bookFirstWalkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.yeXEn"));
            bookFirstWalkFreeButton.click();

            List<WebElement> inputFields = driver.findElements(By.cssSelector("input"));

            log.info("Start");

            inputFields.get(0).click();
            inputFields.get(1).click();
            inputFields.get(2).click();
            inputFields.get(3).click();
            inputFields.get(4).click();
            inputFields.get(0).click();


            List<WebElement> divFields = driver.findElements(By.cssSelector(".sc-bdVaJa.sc-iwsKbI.kOShw"));


//
//            String arrayError = divFields.get(0).getText();
//
            String expError = "required";
//
//            Assert.assertEquals(arrayError, expError);

            for(int i = 0; i < divFields.size(); i++){
                Assert.assertEquals(expError, divFields.get(i).getText()    );



            }







        }











}
