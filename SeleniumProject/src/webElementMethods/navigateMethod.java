package webElementMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.navigate().to("https://www.google.com");
       Thread.sleep(2000);
     //  driver.close();	
      // driver.navigate().back();
       driver.navigate().refresh();
       
	}
}
