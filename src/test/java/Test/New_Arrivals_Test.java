package Test;

import Base.Base;
import Pages.LoginPage;
import Pages.NewArrivalsPage;
import Utility.utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class New_Arrivals_Test extends Base {
    public New_Arrivals_Test() {
        super();
    }

    /**
     *  To Run Initialize method before running each Testcases and To Open
     * browser
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
    public void New_Arrivals_Post() {

        loginp = new LoginPage();
        loginp.LoginUser();
        newarrival = new NewArrivalsPage();
        newarrival.userNew_Arrivals();

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
