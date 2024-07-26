package Tests_Bestbuy;

import Pages_Bestbuy.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends BaseTest{

    @Test
    public void testLoginPage() throws InterruptedException {

        homePage.setAccount();
        Thread.sleep(2000);
        homePage.setSignIn();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmailAdd("saranya95@gmail.com");
        loginPage.setPassword("Saranya@29cse");
        loginPage.setClickSignIn();
        loginPage.setLoginSkipNow();

        //Validating Assertion
        String str = driver.getTitle();
        System.out.println(str);
        Assert.assertEquals(str, "Best Buy | Official Online Store | Shop Now & Save ");
    }
}
