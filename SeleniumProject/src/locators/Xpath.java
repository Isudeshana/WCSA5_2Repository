package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	      driver.get("https://www.flipkart.com/");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[text()='✕']")).click();
	      driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Moto mobiles");
	      driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	     
	}

}
