package Test;

import Base.Base;
import Pages.Art_Photography_Page;
import Pages.LoginPage;
import Utility.utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(Utility.Listeners.class)
public class Art_Photography_Test extends Base {

    public Art_Photography_Test() {
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
    public void Art_and_Photography_Post() {

        loginp = new LoginPage();
        loginp.LoginUser();
        art = new Art_Photography_Page();
        art.user_Architecture();

    }

    @Test
    public void treatment_subject_Post() {

        loginp = new LoginPage();
        loginp.LoginUser();
        art = new Art_Photography_Page();
        art.userArt_treatments_and_subjects();

    }
    @Test
    public void Dance_performance_Post() {

        loginp = new LoginPage();
        loginp.LoginUser();
        art = new Art_Photography_Page();
        art.userDanceAndOther_performingArts();

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

