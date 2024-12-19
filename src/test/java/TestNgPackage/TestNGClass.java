package TestNgPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGClass {
//	1.	assertEquals

//	****************
	@Test
	public void testEquals() {
	    int expected = 5;
	    int actual = 2 + 3;
	    Assert.assertEquals(actual, expected);
	}
	//2.	assertTrue

//	****************
	@Test
	public void testTrue() {
	    boolean condition = (2 + 2 == 4);
	    Assert.assertTrue(condition);
	}
	//3.	assertFalse

	//****************
	@Test
	public void testFalse() {
	    boolean condition = (2 + 2 == 5);
	    Assert.assertFalse(condition);
	}
	//4.	assertNotNull

	//****************
	@Test
	public void testNotNull() {
	    String str = "Hello, world!";
	    Assert.assertNotNull(str);
	}
	//5.	assertNull

	//****************
	@Test
	public void testNull() {
	    String str = null;
	    Assert.assertNull(str);
	}
	//6.	assertThrows (TestNG doesn't have a direct assertThrows method, but you can use ExpectedExceptions or try-catch block.)

	//****************
	@Test(expectedExceptions = ArithmeticException.class)
	public void testThrows() {
	    int result = 1 / 0;
	}

}
