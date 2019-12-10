package wagwalking;

import org.junit.Assert;
import org.junit.Test;

public class ApplyGetTest extends BaseTest {

    @Test
    public void TestApplyGet() {


        HomePage homePage = new HomePage(driver);
        homePage.clickBookFirstWalkFreeButton();

        ApplyPage applyPage = new ApplyPage(driver);
        applyPage.inputEmail("Test@test.com");
        applyPage.inputFirstName("Kolyn");
        applyPage.inputLastName("Fasa");
        applyPage.inputPhone("(838)3338699");


        String email = applyPage.getEmail();
        Assert.assertEquals("Test@test.com", email);

        String firstName = applyPage.getFirstName();
        Assert.assertEquals("Kolyn", firstName);

        String lastName = applyPage.getLastName();
        Assert.assertEquals("Fasa", lastName);

        String phone = applyPage.getPhone();
        Assert.assertEquals("(383)3338699", phone);






    }
}
