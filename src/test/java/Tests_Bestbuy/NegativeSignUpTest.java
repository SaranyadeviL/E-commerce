package Tests_Bestbuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeSignUpTest extends BaseTest {

    @Test
    public void negativeSignUp() throws InterruptedException {

        //Clicking Account Button
        homePage.setAccount();

        Thread.sleep(2000);
        homePage.setCreateAccount();
        //Sending keys to create new account
        signUpPage.setFirstName("Saranya");
        signUpPage.setLastName("Devi");
        signUpPage.setEmail("saranya95@gmail.com");
        signUpPage.setPassword("Saranya@29cse");
        signUpPage.setReEnterPassword("Saranya@29cse");
        signUpPage.setPhoneNumber("7373329541");
        signUpPage.setRecoverPhoneNum();
        signUpPage.setSubmit();
        //Getting error message
        WebElement error = driver.findElement(By.xpath("//strong[text()='An account with this email already exists.']"));
        Thread.sleep(5000);
        String actualErrorMessage =  error.getText();
        Assert.assertEquals(actualErrorMessage,"An account with this email already exists.");

    }


}
