package TestNgPackage;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AsssertionClass {
  @Test
  public void f() {
	//  Assert.assertTrue(false,"failded due to ");		// HardAssert
	  System.out.println(" Assert.assertTrue(false);");
	  
	  
	  SoftAssert sa = new SoftAssert(); // SoftAssert
	  sa.assertTrue(false);
	  System.out.println("sa.assertTrue(false);");
	  sa.assertAll();	// it is mandatory to mark tc fail (if) otherwise it will pass tc
	  
	  if(true==false) {
		  System.out.println("true==false");
	  }
	  System.out.println("Still executing true==false");
	  
	 
	  
	  
	  
  }
  
  
}
