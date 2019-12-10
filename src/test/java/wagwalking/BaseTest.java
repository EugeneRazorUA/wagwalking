package wagwalking;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;

    protected static Client client;
    protected static Client clientError;
    protected HomePage homePage;
    protected ApplyPage applyPage;



    @BeforeClass
    public static void start(){



        System.setProperty("webdriver.chrome.driver","/Users/evgeniibeliaev/Desktop/chromedriver");

        driver = new ChromeDriver();

        driver.manage().window().fullscreen();

        driver.get("https://wagwalking.com/");

        String actualTitle = driver.getTitle();

        System.out.println(actualTitle);

        String expectedTitle = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners";

        Assert.assertEquals(expectedTitle, actualTitle);

//        client = new Client("test@test.com", "111", "Egor", "Bob",
//                "34324567");
//
//        clientError = new Client("13838372","dhashsh", "12233","uwuw6",
//                "gdhjakajkah");

    }

    @AfterClass
    public static void finish(){
        driver.quit();}












}
