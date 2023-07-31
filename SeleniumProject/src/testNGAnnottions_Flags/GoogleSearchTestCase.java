
package testNGAnnottions_Flags;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchTestCase extends BaseTest {
  @Test(description = "TestCase1")
  public void search1() throws InterruptedException {
	  driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
	  Thread.sleep(20000);
  }
  @Test(description = "TestCase1")
  public void search2() throws InterruptedException {
	  driver.switchTo().activeElement().sendKeys("SQl",Keys.ENTER);
	  Thread.sleep(20000);
  }
  @Test(description = "TestCase1")
  public void search3() throws InterruptedException {
	  driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
	  Thread.sleep(20000);
  }

}
