package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInClass {

	@FindBy(xpath = "//input[@id='user-name']")private WebElement user_name;
	@FindBy(xpath = "//input[@id='password']")private WebElement pass_word;
	@FindBy(xpath = "//input[@id='login-button']")private WebElement click_button;

	public LogInClass(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void EnterUserId(WebDriver driver,String UN) {
		user_name.sendKeys("standard_user");

	}

	public void EnterPassword(WebDriver driver,String PWD) {
		pass_word.sendKeys("secret_sauce");
	}

	public void ClickOnLoginButton(WebDriver driver) {
		click_button.click();
	}

}
