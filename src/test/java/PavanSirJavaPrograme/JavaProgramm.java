package PavanSirJavaPrograme;

import org.testng.annotations.Test;

public class JavaProgramm {
  @Test
  public void swapNumbers() {
	  int a = 500;
	  int b = 1000;
	  a=a+b;
	  b=a-b;
	  a=a-b;
	  System.out.println(a);
	  System.out.println(b);
  }
  
  @Test
  public void reverseNum() {
	  int a = 1331;
	  int revNum = 0;
	  int rem=0;
	  while(a>0) {
		  rem=a%10;
		  a=a/10;
		  revNum=revNum*10+rem;
	  }
	  System.out.println(revNum);
	  if(revNum==a) {
		  System.out.println("this is palidrome number");
	  }else {System.out.println("this is not");}
  }
  
  @Test
  public void revString() {
	  String str = "Ganesh Hope It";
	  String revStr = "";
	  for(int i=str.length()-1; i>=0; i--) {
		  revStr += str.charAt(i);
	  }
	  System.out.println(revStr);
  }
  
  @Test
  public void palidromeNum() {
	  JavaProgramm jp = new JavaProgramm();
	  jp.reverseNum();
  }
  
  @Test
  public void NumerOfDigits() {
	  int a= 12384;
	  int count = 0;
	  while(a>0) {
		  a=a/10;
		  count++;
	  }
	  System.out.println(count);
  }
  @Test
  public void NumerOfDigitsEVEN() {
	  int a= 12384;
	  int Evencount = 0;
	  int Oddcount = 0;
	  while(a>0) {
		  int rem=a%10;
		  if(rem%2==0) {
			  Evencount++;
		  }else { Oddcount++; }
		  	 a=a/10;
		  	
	  }
	  System.out.println(Evencount);
	  System.out.println(Oddcount);

  }
  
  @Test
  public void SumOfDigits() {
	  int a = 1534;
	  int sum = 0;
	  while(a>0) {
		  int rem=a%10;
		sum = sum+rem;
		  	 a=a/10;
	  }
	  System.out.println(sum);
  }

  @Test
  public void LargestNumber() {
	  int a=10;
	  int b=52;
	  int c=5;
	  
	  int large = a>b?a:b;
	  int largest = c>large?c:large;
	  System.out.println(largest);
	  
  }

  @Test
  public void fibonacciSequece() {
	  int n1=0;
	  int n2=1;
	  int n3=1;
	  for(int i=1; i<15; i++) {
		  System.out.println(n1);
		  n1=n2;
		  n2=n3; 
		  n3=n2+n1;
		  
	  }
	  
  }

  @Test
  public void primeNum() {
	  for(int i=1; i<20; i++) {
		  int count=0;
		  for(int j=2; j<i; j++) {
			  if(i%j==0) {
				  count++;
			  }
		  }
		  if(count==0) {
			  System.out.println(i);
		  }
	  }

  }

  @Test
  public void f1() {
  }

  
  @Test
  public void f2() {
  }
}
