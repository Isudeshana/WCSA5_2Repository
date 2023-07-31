package testNGAnnottions_Flags;

import org.testng.annotations.Test;

public class Flag3 {
  @Test(invocationCount = 50)
  public void method1() 
  {
	  System.out.println("method1");
  }
  
}
