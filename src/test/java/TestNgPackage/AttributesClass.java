package TestNgPackage;


import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Listeners;




public class AttributesClass {
	
	@Test(priority=8, groups = {"smoke"})		
	public void m8(){
		System.out.println("8th method : grouping smokescenario and run ");
	}
	
	@Test(priority=7, groups = {"smoke"})		
	public void m7(){
		System.out.println("7th method : grouping smokescenario and run ");
	}
	
	@Test(priority=6, enabled = true)		// true for enable(run) and false for disble
	public void m6(){
		System.out.println("6th method");
	}

	@Test(priority=1)
	public void m1(){
		System.out.println("1st method");
	}
	
	@Test(priority=2 , description = "yoyo passing mesasge to tc")
	public void m2(){
		System.out.println("2nd method : with decription attribute");
	}
	
	@Test(priority=2 , timeOut =  5000)
	public void m3(){
		System.out.println("3rd method : of timeout attribute");
	}
	
	@Test(priority=3 , invocationCount = 6)		// it will run tc multiple time for load testing
	public void m4(){
		System.out.println("4th method : of invocationCount attribute");
	}
	
	// First, you need to add the JUnit 5 Retry library dependency to your pom.xml 
	//if you are using Maven:
	@Test(retryAnalyzer = RetryAnalyzer.class )		// it will Rerun failed tc (3) multiple time
		public void m5(){
		String s1 = "Google";
		String s2 = "google";
		System.out.println("5th method : of Rerun failed tc multiple time");
		Assert.assertEquals(s1, s2);
		
	}


	
}
