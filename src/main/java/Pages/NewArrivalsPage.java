package Pages;

import Base.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Base.Base.driver;

public class NewArrivalsPage extends Base {
    @FindBy(xpath="//li[@id='ctl00_linewrelease']//a[contains(text(),'New Arrivals')]")
    WebElement NewArrivalsBtn;



    @FindBy(xpath="//a[contains(text(),'Quick View')]")
    WebElement QuickViewBtn;

    @FindBy(xpath="//a[contains(text(),'Add To Cart')]")
    WebElement AddToCartBtn;


    public void userNew_Arrivals() {
        WebDriverWait wait = new WebDriverWait(driver,40);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(NewArrivalsBtn));
            NewArrivalsBtn.click();

            JavascriptExecutor js = (JavascriptExecutor) driver;
            for (int i = 1; i < 5; i++) {
                js.executeScript("window.scrollBy(0, 1000)");
                Thread.sleep(1000);
            }
            for (int i = 1; i < 5; i++) {
                js.executeScript("window.scrollBy(0, -1000)");
                Thread.sleep(1000);
            }



            wait.until(ExpectedConditions.visibilityOfAllElements(QuickViewBtn));
            QuickViewBtn.click();

            wait.until(ExpectedConditions.visibilityOfAllElements(AddToCartBtn));
            AddToCartBtn.click();



        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
