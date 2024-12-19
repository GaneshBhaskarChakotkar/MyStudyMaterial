package PracticePackage;

import org.testng.annotations.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.testng.annotations.DataProvider;

public class DataproviderClass {
	
	
	@RepeatedTest(10)
  @Test(dataProvider = "dpMethod")
    public void TestMethod(Integer n, String s) throws Exception {
	  System.out.println(n);
	  System.out.println(s);
	  Thread.sleep(3000);
  }

  @DataProvider
  public Object[][] dpMethod() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" }
    };
  }
}
