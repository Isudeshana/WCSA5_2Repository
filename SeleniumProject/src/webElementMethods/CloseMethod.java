package webElementMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.Chrome.driver", "./driver.chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      
     Thread.sleep(2000);
     driver.get("https://www.flipkart.com/");
     Thread.sleep(2000);
     driver.close();
     driver.quit();
     //driver.get("https://wwww.flipcart.com/");
      
	}

}
