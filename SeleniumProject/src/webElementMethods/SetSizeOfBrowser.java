package webElementMethods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeOfBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
      Dimension targetSize = new Dimension(350,450);
      driver.manage().window().setSize(targetSize);
      
	}

}
