package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//*[@name='username']") private WebElement usnTB;
	@FindBy(xpath="//*[@name='pwd']") private WebElement pssTB;
	@FindBy(xpath="//*[contains(@class,'initial')]") private WebElement LoginButton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement checkBox;
	@FindBy(partialLinkText="Actimind Inc.") private WebElement actMindlink;
	
	//intialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Utilization

	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPssTB() {
		return pssTB;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getActMindlink() {
		return actMindlink;
	}
	
	//operational Methods
	public void validLoginMethod(String validusername, String validPassword) {
		usnTB.sendKeys("vallidUsename");
		pssTB.sendKeys("validPassword");
		LoginButton.click();
		}
	
	public void invalidMethod(String invalidUsername, String invalidPassword) throws InterruptedException {
		usnTB.sendKeys("invalidUsername");
		pssTB.sendKeys("invalidPassword");
		LoginButton.click();
		Thread.sleep(2000);
		usnTB.clear();
	}
	
	


}
