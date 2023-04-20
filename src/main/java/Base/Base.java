package Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import Pages.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Base {
    public static WebDriver driver;
    public static WebElement element;
    protected static FileInputStream file;
    public static Properties prop;
//    protected static Utility util;
    protected static FileInputStream excelfile;
    protected static XSSFWorkbook xWorkBook;
    protected static XSSFSheet xSheet;
    protected static Object[][] data;
    public static LoginPage loginp;
    protected static Art_Photography_Page art;
    protected static BestSellersPage bestseller;

    protected static NewArrivalsPage newarrival;
    protected static FictionBookPage fictionbook ;
    static {

        WebDriverManager.chromedriver().setup();
    }
    protected final static String FILE_PATH = System.getProperty("user.dir") + File.separator + "src" + File.separator
            + "main" + File.separator + "resources" + File.separator + "repository" + File.separator
            + "LoginTestData.xlsx";

    /**
     *  To Load the Properties file in file.io
     */
    public Base() {
        try {
            prop = new Properties();
            file = new FileInputStream(
                    "C:\\Users\\OMKAR BADE\\IdeaProjects\\BooksWaganApp\\src\\main\\resources\\Repository\\Config,properties");
            prop.load(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
