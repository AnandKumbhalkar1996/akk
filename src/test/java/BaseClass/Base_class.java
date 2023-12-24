package BaseClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utility.Utility;

public class Base_class {

	protected WebDriver driver;

	public void browserInitialize() throws IOException {
		
	
	
		driver = new ChromeDriver();
		
		driver.get(Utility.readDataFromPropertyFile("URL"));
		driver.manage().window().maximize();

	}
	
	
}
