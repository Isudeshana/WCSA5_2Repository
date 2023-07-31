package webElementMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.instagram.com/");
//       String LoginPageTitle = driver.getTitle();
//       System.out.println(LoginPageTitle);
//        String Scode = driver.getPageSource();
//        System.out.println(Scode);
     String URL = driver.getCurrentUrl();
     System.out.println(URL);
        Thread.sleep(2000);
        driver.close();
	}

}
