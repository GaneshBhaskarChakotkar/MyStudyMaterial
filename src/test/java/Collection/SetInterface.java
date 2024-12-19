package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;


import org.testng.annotations.Test;

public class SetInterface {
  @Test
  public void HashSetClass() {
	  
      // Create two sets
      Set<String> set1 = new HashSet<String>();
      Set<String> set2 = new HashSet<String>();
      
      // Add elements to set1
      set1.add("apple");
    //  set1.add("banana");
      set1.add("cherry");
      
      // Add elements to set2
      set2.add("banana");  
      set2.add("cherry");
      set1.retainAll(set2);
      System.out.println("****************Fruits****************");
      System.out.println(set1);
      System.out.println(set2);
      
      
  	  ArrayList<Integer> al = new ArrayList<Integer>();
  al.add(12);
  al.add(15);
  al.add(15);
  al.add(20);
  al.add(10);
  al.add(05);
  System.out.println(al);
	  
	  Set<Integer> a1 = new HashSet<Integer>();
	 a1.addAll(al);
	  System.out.println(a1);
	  System.out.println(a1.iterator());
	  Set<Integer> a2 = new TreeSet<Integer>();
	  a2.addAll(a1);
	  System.out.println("this is from treeset :"+a2);
	  
	 
	/*  for(Integer ji : a1) {
		  System.out.println(ji);
	  }
	  System.out.println("*********using 2nd");
	  Iterator<Integer> ir = a1.iterator();
	  for(Integer ji : a1) {
		  System.out.println(ji);
	  }*/
	  
  }
  
  @Test
  public void LinkedHashSetClass() {
	  
	  LinkedHashSet<Integer> a1 = new LinkedHashSet<Integer>();
	  a1.add(12);
	  a1.add(15);
	  a1.add(20);
	  a1.add(10);
	  a1.add(05);
	  System.out.println(a1);
	  System.out.println(a1.iterator());
	  
	  Iterator<Integer> ir = a1.iterator();
	  while(ir.hasNext()) {
		  System.out.println(ir.next());
	  }
		 
	 
	  
  }
  
  @Test
  public void TreeSetClass() {
	  
	  
	  LinkedHashSet<Integer> a2 = new LinkedHashSet<Integer>();
	  a2.add(12);
	  a2.add(15);
	  a2.add(20);
	  a2.add(10);
	  a2.add(05);
	  System.out.println("this is linkedHashSet : "+a2);
	  
	  TreeSet<Integer> a1 = new TreeSet<Integer>();
	  a1.add(12);
	  a1.add(15);
	  a1.add(20);
	  a1.add(10);
	  a1.add(05);
	  System.out.println("this is HashSet : "+a1);
		  
	 
	  
	  System.out.println(a1.descendingSet());
	  System.out.println("this is from headSet"+a1.headSet(12));
	  System.out.println("this is from tailSet"+a1.tailSet(12));
	  System.out.println("this is from subSet"+a1.subSet(03,13));
	  Iterator<Integer> ir = a1.iterator();
	  while(ir.hasNext()) {
		  System.out.println("This is best elemetn fron tree set : "+ir.next());
	  } 
	 
	  
  }
  
}
