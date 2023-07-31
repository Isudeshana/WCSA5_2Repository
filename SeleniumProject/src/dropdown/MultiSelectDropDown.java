package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
      driver.get("file:///C:/Users/BALAJI%20COMPUTER/Downloads/select%20food.html");
      WebElement dropdown = driver.findElement(By.id("menu"));
       Select sel = new Select(dropdown);
     for(int i=0;i<=7;i++)
     {
    	 sel.selectByIndex(i);
     }
     Thread.sleep(2000);
     sel.deselectAll();
	}

}
