package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static String getDatafromExcel(int rowIndex, int columnIndex) throws EncryptedDocumentException, IOException

	{
		FileInputStream Myfile = new FileInputStream("C:\\Users\\user\\Desktop\\mytesting.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet4");
		String value = Mysheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
		return value;

	}

	public static void captureScreenshot(WebDriver driver, int TCID) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("F:\\Velocity\\May-2021 Class\\Java\\Screenshot eg\\TestCaseID" + TCID + ".png");
		org.openqa.selenium.io.FileHandler.copy(src, dest);

	}

	public static String readDataFromPropertyFile(String key) throws IOException {

		// create object of Properties class
		Properties prop = new Properties();

		// create object of FileInputStream
		FileInputStream myFile = new FileInputStream("D:\\Selenioum eclips ide 23-09 workspace\\pract_123\\Property file");
		prop.load(myFile);
		String value = prop.getProperty(key);

		return value;

	}

}
