package Tests_Bestbuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTest extends  BaseTest {

    @Test
    public void testNegativeLoginPage() throws InterruptedException {

        //Clicking Account Button
        homePage.setAccount();
        Thread.sleep(2000);
        homePage.setSignIn();

        //Sending Keys
        loginPage.setEmailAdd("saranya95@gmail.com");
        loginPage.setPassword("Saranya@29cse");
        loginPage.setClickSignIn();
        Thread.sleep(2000);

        //Getting Error Message
        WebElement str = driver.findElement(By.xpath("//div[text()='Sorry, something went wrong. Please try again.']"));
        str.getText();
        Thread.sleep(5000);
        Assert.assertEquals(str, "Sorry, something went wrong. Please try again");
        System.out.println(str);
    }

}
