package testNGPackage;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class BaseTest {
   static WebDriver driver;
   @BeforeMethod
  public void setup() {
	   System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
	   driver=new EdgeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("http://desktop-1ge4rpa/login.do");
	   
  }
   
   public void failedMethod(String failedMethodName)
   {
	   TakesScreenshot ts=(TakesScreenshot)driver;
	   File src = ts.getScreenshotAs(OutputType.FILE);
	  File dest = new File("./screenshot/"+failedMethodName+".png");
	  try
	  {
		  Files.copy(src, dest);
	  }
	  catch(Exception e)
	  {
		  
	  }
	  
   }
   @AfterMethod
   public void tearDown()
   {
	   driver.quit();
   }
   
  }
