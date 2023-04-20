package Test;

import Base.Base;
import Pages.FictionBookPage;
import Pages.LoginPage;
import Utility.utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;





public class Fiction_Book_Test extends Base {
    public Fiction_Book_Test() {
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
    public void Fiction_Book_Post() {

        loginp = new LoginPage();
        loginp.LoginUser();
        fictionbook= new FictionBookPage() ;
        fictionbook.userFiction_Book();

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
