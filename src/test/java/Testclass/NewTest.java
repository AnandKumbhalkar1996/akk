package Testclass;

import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.Base_class;
import PomClasses.LogInClass;
import Utility.Utility;

public class NewTest extends Base_class implements ITestListener {

	LogInClass page1;

	@BeforeClass
	public void LaunchBrowser() throws IOException {

		Reporter.log("Launching Browser", true);
		
		
		browserInitialize();
			
		page1 = new LogInClass(driver);

	}

	
	
	
	@Test
	public void logInUserID(WebDriver driver ) throws IOException, InterruptedException {

		String UN = Utility.readDataFromPropertyFile("UN");
        String PWD = Utility.readDataFromPropertyFile("PWD");
        
		page1.EnterUserId(driver,UN);
		Reporter.log("Enterning userid", true);
		
		
		page1.EnterPassword(driver,PWD);
		Reporter.log("Enterning passward", true);
 
		
		page1.ClickOnLoginButton(driver);
		Reporter.log("clicking on log in button", true);

	}

	
	
	

}
