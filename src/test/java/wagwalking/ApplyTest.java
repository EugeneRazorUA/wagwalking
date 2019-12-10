package wagwalking;

import org.junit.Test;

public class ApplyTest extends BaseTest {

    @Test

    public void testApply(){

       HomePage homePage = new HomePage(driver);

       ApplyPage applyPage = homePage.clickBookFirstWalkFreeButton();


//
//       applyPage.inputEmail("Test@test.com");
//
//       applyPage.inputPassword("12344223");
//
//       String email = applyPage.getEmail();
//
//        Assert.assertEquals("Test@test.com", email);
//
//
//


    }
}
