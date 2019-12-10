package wagwalking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }
    @FindBy(css=".sc-ifAKCX.yeXEn")
    private WebElement bookFirstWalkFreeButton;

    public ApplyPage clickBookFirstWalkFreeButton(){
        wait.until(ExpectedConditions.elementToBeClickable(bookFirstWalkFreeButton));
        bookFirstWalkFreeButton.click();
        return new ApplyPage(driver);

    }










}
