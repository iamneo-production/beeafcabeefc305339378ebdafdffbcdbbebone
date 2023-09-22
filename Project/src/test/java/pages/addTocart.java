package pages;

import java.io.IOException;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import java.util.Map;
import uistore.home;
import uistore.searchPage;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
import uistore.cart;

public class addTocart extends Base  {

    private Map<String, String> testData; 

    java.util.logging.Logger log = LoggerHandler.getLogger();
    ExtentReports reporter = Reporter.generateExtentReport();
    ExcelReader file = new ExcelReader();
    cart cr = new cart();
    home td = new home();
    searchPage sp = new searchPage();
    ExtentTest test = Reporter.generateExtentReport().createTest(" Inside Cart", "Assert Product Title");
 
    public void searchProduct1() throws InvalidFormatException, IOException {
    
    	try 
    	{
    		String data = ReadData("Productslist", 2, "MobilePhones");
        	ClickOnElement(td.search_label);
        	sendKeys(td.search_label,data);
        	ClickOnElement(td.Search_Button);
        	log.info("Product Searched Successfully");
        	Screenshot.getScreenShot(driver, "Search Results");
    	}
    	catch
    	 (InvalidFormatException | IOException e) {
            // Handle the exception as needed
    		e.printStackTrace(); // Replace this with appropriate error handling
    		log.warning("Timeout Expection");
    		Screenshot.getScreenShot(driver, "Products Not loaded");
        }
    	
    }
    
    public void addtocart_click() {
        try {
            ClickOnElement(sp.ProducdName);
            log.info("Product clicked");
            switchToNewWindow();
            ClickOnElement(cr.addtoCart_btn1);
            log.info("add to cart with product");
        } catch (Throwable throwable) {
            // Handle the exception as needed
            throwable.printStackTrace(); // Replace this with appropriate error handling or logging
        }
    }

    
    public void navigateCart() {
        try {
            ClickOnElement(cr.cart_btn);
             log.info("Cart clicked");
        } catch (Exception e) {
            // Handle the exception as needed
            e.printStackTrace(); // Replace this with appropriate error handling or logging
        }
    }
      
}


