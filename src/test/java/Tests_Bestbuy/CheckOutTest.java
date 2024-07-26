package Tests_Bestbuy;

import Pages_Bestbuy.CheckOutPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;


public class CheckOutTest extends BaseTest {
    @Test(priority = 4)
    public void testCheckOutPage() {

        //Giving Address to place the order
        CheckOutPage.setCheckout();
        CheckOutPage.setContinueAsGuest();
        CheckOutPage.setSwitchToPickup();
        CheckOutPage.setFirstName("Saranya");
        CheckOutPage.setLastName("Devi");
        CheckOutPage.setAddress("NsnPalayam, Coimbatore");
        CheckOutPage.setCity("Coimbatore");


        //Dropdown
        WebElement dd = driver.findElement(By.xpath("//select[@id='state']"));
        Select select = new Select(dd);
        select.selectByIndex(1);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        CheckOutPage.setZipCode("641031");
        CheckOutPage.setSaveAddress();
        CheckOutPage.setKeepAddressEntered();


        //Scrolling down to the Email block
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);");
        CheckOutPage.setEmailAddress("Saranya@gmail.com");
        CheckOutPage.setMobileNumber("8056176349");
        CheckOutPage.setCheckBox();
        CheckOutPage.setPaymentInformation();
        CheckOutPage.setCardNumber("8741587900156879");
        CheckOutPage.setExpiryDate("10/29");
        CheckOutPage.setCvvNumber("809");
        CheckOutPage.setApply();


        //Scrolling down to the Place order button
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);");
        CheckOutPage.setPlaceOrder();


        //Assertion
        String str = driver.getTitle();
        System.out.println("The title of the page is: " + str);
        Assert.assertEquals(str, "Checkout - Best Buy");
    }
}
