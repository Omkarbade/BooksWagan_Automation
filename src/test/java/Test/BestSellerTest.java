package Test;

import Base.Base;
import Pages.BestSellersPage;
import Pages.LoginPage;
import Utility.utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(Utility.Listeners.class)
public class BestSellerTest extends Base {

    public BestSellerTest() {
        super();
    }

    /**
     * To Run Initialize method before running each Testcases and To Open browser
     */
    @BeforeMethod
    public void triggerDriver() {
        try {

            utility.intilization(prop.getProperty("browser"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Bestseller_Post() {

        loginp = new LoginPage();
        loginp.LoginUser();
        bestseller = new BestSellersPage();
        bestseller.userBest_Seller();

    }

    /**
     * To Run Terminate method after running each Testcases
     */

    @SuppressWarnings("static-access")
    @AfterMethod
    public void terminateDriver() {
        try {

            Thread.sleep(4000);
            utility.closedriver();

        } catch (Exception e) {

        }
    }
}

