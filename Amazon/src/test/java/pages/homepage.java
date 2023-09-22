package pages;

import java.io.IOException;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import java.util.Map;
import uistore.home;
import utils.Reporter;
import utils.Screenshot;

public class homepage extends Base  {

    private Map<String, String> testData; 

    java.util.logging.Logger log = LoggerHandler.getLogger();
    ExtentReports reporter = Reporter.generateExtentReport();
    ExcelReader file = new ExcelReader();
    home td = new home();
    ExtentTest test = Reporter.generateExtentReport().createTest("Assert check", "Assert Today's Deal page");

//************Reference without try catch block*****************  
    
//    public void todaysdeals_click()
//    {
//    	ClickOnElement(td.todaysDeals_label);
//    	System.out.println("Inside TodaysDeals2");
//    	Screenshot.getScreenShot(driver, "Login sucessfull");
//    }
//    
//    public void searchProduct() throws InvalidFormatException, IOException {
//    	String data = ReadData("Productslist", 2, "MobilePhones");
//    	ClickOnElement(td.search_label);
//    	sendKeys(td.search_label,data);
//    	ClickOnElement(td.Search_Button);
//    }
    
    public void todaysdeals_click() {
        try {
            ClickOnElement(td.todaysDeals_label);
            System.out.println("Inside TodaysDeals2");
            Screenshot.getScreenShot(driver, "Loaded Today's Deals");
            l
        } catch (Exception e) {
            // Handle the exception as needed
            e.printStackTrace(); // Replace this with appropriate error handling or logging
        }
    }

    public void searchProduct() {
        try {
            String data = ReadData("Productslist", 1, "MobilePhones");
            ClickOnElement(td.search_label);
            sendKeys(td.search_label, data);
            ClickOnElement(td.Search_Button);
        } catch (InvalidFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    
      
}


