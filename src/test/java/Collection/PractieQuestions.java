package Collection;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class PractieQuestions {
  @Test
  public void f() {
	  System.out.println("1.Write a program To find duplicates between two lists?");
	  ArrayList<Integer> a1 = new ArrayList<Integer>();
	  a1.add(12);
	  a1.add(15);
	  a1.add(20);
	  a1.add(10);
	  a1.add(05);
	  System.out.println(a1);
	  ArrayList<Integer> b1 = new ArrayList<Integer>();
	  b1.add(7);
	  b1.add(23);
	  b1.add(20);
	  b1.add(10);
	  b1.add(50);
	 System.out.println(b1); 
	  System.out.println(a1.retainAll(b1));
	  System.out.println(a1);
	  System.out.println(b1);
  }
}
