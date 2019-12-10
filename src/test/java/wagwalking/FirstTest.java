package wagwalking;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FirstTest extends BaseTest {

    @Test
    public void testFirst (){



        WebElement bookFirstWalkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.yeXEn"));
        bookFirstWalkFreeButton.click();

        WebElement emailField = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        emailField.sendKeys(clientError.getEmail());

        WebElement passwordField = driver.findElement(By.cssSelector("input[name=\"password\""));
        passwordField.sendKeys(clientError.getPassword());

        WebElement firsField = driver.findElement(By.cssSelector("input[name=\"firstName\""));
        firsField.sendKeys(clientError.getFirstName());

        WebElement lastField = driver.findElement(By.cssSelector("input[name=\"lastName\""));
        lastField.sendKeys(clientError.getLastName());

        WebElement cellPhoneField = driver.findElement(By.cssSelector("input[name=\"phone\""));
        cellPhoneField.sendKeys(clientError.getPhone());







    }
}
