package LIstner;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import BaseClass.Base_class;

public class Listner extends Base_class implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		
		String methodname = result.getName();
		Reporter.log("TC"+methodname+"is complted sucessfully",true);
	}
	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("TC"+result.getName()+"is complted sucessfully",true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		Reporter.log("TC"+result.getName()+"is complted sucessfully",true);
	}
	
	
}
