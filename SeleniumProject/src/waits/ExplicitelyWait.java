package waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitelyWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
       driver.get("https://www.instagram.com/");
       boolean check= wait.until(ExpectedConditions.titleContains("instagram"));
	}

}
