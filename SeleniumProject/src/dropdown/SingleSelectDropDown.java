package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
      driver.get("https://www.amazon.com/");
     WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
      Select sel = new Select(dropdown);
     // sel.selectByIndex(2);
    //  driver.findElement(By.id("nav-search-submit-button")).click();
     // sel.selectByValue("search-alias=automoti,lve-intl-ship");
     //findElement(By.id("nav-search-submit-button")).click();
      sel.selectByVisibleText("Automotive");
      driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
