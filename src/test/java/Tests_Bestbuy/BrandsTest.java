package Tests_Bestbuy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class BrandsTest extends BaseTest {
    @Test(priority = 3)
    public void testBrandPage() throws InterruptedException {

        List<WebElement> btn = BrandsPage.getBrandAllMenu();
        for (WebElement btnLink : btn) {
            btnLink.click();
            Thread.sleep(2000);
        }
        List<WebElement> btn1 = BrandsPage.getBrandButton();
        for (WebElement btnLink1 : btn1) {
            btnLink1.click();
            Thread.sleep(2000);
        }
        BrandsPage.setBrandSamsung();
        //wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        BrandsPage.setSmartPhone(wait);
        BrandsPage.setGalaxyUltra();
        //Scrolling to the Add to cart
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);
        BrandsPage.setBrandCart();
        BrandsPage.setBrandGoToCartCart();

    }
}
