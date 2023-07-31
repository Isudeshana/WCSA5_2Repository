package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Stale {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		WebDriver driver=new  EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-1ge4rpa/login.do");
		
		WebElement usnTB = driver.findElement(By.name("username"));
		WebElement pwdTB = driver.findElement(By.name("pwd"));
		
		driver.navigate().refresh();
		usnTB.sendKeys("admin");
	}

}
