package screenshotPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotUsingExplicitTypeCasting {
  public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.google.com");
	//implementation of screenshot
	 TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshot/google1.png");
	Files.copy(src, dest);
}
}
