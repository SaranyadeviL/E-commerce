package Tests_Bestbuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {

    @Test
    public void validatePositiveSignUp() throws InterruptedException {

        //Clicking Account button
        homePage.setAccount();

        Thread.sleep(2000);
        homePage.setCreateAccount();
        //Sending keys to create new account
        signUpPage.setFirstName("Saranya");
        signUpPage.setLastName("Devi");
        signUpPage.setEmail("saranya29@gmail.com");
        signUpPage.setPassword("Saranya@29cse");
        signUpPage.setReEnterPassword("Saranya@29cse");
        signUpPage.setPhoneNumber("7373329541");
        signUpPage.setRecoverPhoneNum();
        signUpPage.setSubmit();
        signUpPage.setSkipNow();

        //Assertions to validate successful sign-up
        WebElement str = driver.findElement(By.xpath("//div[@class='welcome-wrapper--not-emphasized']"));
        str.getText();
        Assert.assertEquals(str, "Hi,Saranya Devi. Welcome back.");
    }
}
