package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mintra {
   public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://www.myntra.com/");
	Thread.sleep(2000);
	//driver.switchTo().activeElement().sendKeys("mobiles",Keys.ENTER);
	driver.findElement(By.xpath("//*[contains(@class,'desktop-searchBar')]")).sendKeys("mobiles",Keys.ENTER);
	//Actions act =new Actions(driver);
	//act.moveToElement(target);
}
}
