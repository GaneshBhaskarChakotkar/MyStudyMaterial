package TestNgPackage;

import static org.testng.AssertJUnit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.testng.annotations.Test;

public class Junitclass {
  @Test
  public void f() {
  }// 1.	assertEquals

	 // ****************
	  @Test
	  public void testEquals() {
	      int expected = 5;
	      int actual = 2 + 3;
	      assertEquals(expected, actual);
	  }
	//  2.	assertTrue

	//  ****************
	  @Test
	  public void testTrue() {
	      boolean condition = (2 + 2 == 4);
	      assertTrue(condition);
	  }
	//  3.	assertFalse

	//  ****************
	  @Test
	  public void testFalse() {
	      boolean condition = (2 + 2 == 5);
	      assertFalse(condition);
	  }
	//  4.	assertNotNull

//	  ****************
	  @Test
	  public void testNotNull() {
	      String str = "Hello, world!";
	      assertNotNull(str);
	  }
	//  5.	assertNull

	//  ****************
	  @Test
	  public void testNull() {
	      String str = null;
	      assertNull(str);
	  }
	//  6.	assertThrows

	//  ****************

	  }


