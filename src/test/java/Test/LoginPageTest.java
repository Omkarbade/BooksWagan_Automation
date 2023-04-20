package Test;

import Base.Base;
import Pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import Utility.utility;
import org.testng.annotations.Test;

public class LoginPageTest extends Base {
    public LoginPageTest() {

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

    /**
     *  To Test Login Page is working or not using config file
     */

    @SuppressWarnings("static-access")
    @Test
    public void validLoginPagewithConfigDataTest() {

        loginp = new LoginPage();
        loginp.LoginUser();
        String homePageTitle = utility.verifyHomePage();
        assertEquals(homePageTitle, "Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com");
    }


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
