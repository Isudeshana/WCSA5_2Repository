package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SelectBrowser {
  @Test
  @Parameters({"browser","url","usn","pass"})
  public void testParallelExecution(String browservalue, String url, String usn, String pass) throws InterruptedException {
	 if(browservalue.equalsIgnoreCase("Edge"))
	 {
	  System.setProperty("webdriver.edge.driver", "./driver/edgedriver.exe");
	  WebDriver driver= new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get(url);
	  driver.findElement(By.name("username")).sendKeys(usn);
	  driver.findElement(By.className("pwd")).sendKeys("pass");
	  driver.findElement(By.id("loginButton")).click();
	  Thread.sleep(2000);
	  driver.quit();
	 }
	 else if(browservalue.equalsIgnoreCase("firefox"))
	 
	
  }
}
