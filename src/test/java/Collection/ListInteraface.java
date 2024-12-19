package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;


import org.testng.annotations.Test;

public class ListInteraface {
//	1. D/O
	
  @Test
  public void arrayList() {
	  System.out.println("***********ArrayList**************");
	  	  ArrayList<Integer> a1 = new ArrayList<Integer>();
	  a1.add(12);
	  a1.add(15);
	  a1.add(20);
	  a1.add(10);
	  a1.add(05);
	  System.out.println(a1);
	  a1.set(2, 15);
	  System.out.println(a1);
	  // add(),clear(),isEmpty(),contains(),size(),addAll()	
	  System.out.println(a1.size());
	  System.out.println(a1.contains(10));
	  System.out.println(a1.isEmpty());
	  //a1.clear();
	  System.out.println(a1);
	  a1.remove(3);
	  System.out.println(a1);
	  a1.add(3,30);
	  System.out.println(a1);
	  for(Integer j : a1) {
		  System.out.println("this is from arraylist"+j);
	  }
	  System.out.println(a1.contains(10));
	  
	  System.out.println("**********************");
	  Collections.sort(a1);
	  System.out.println(a1);
	  
	  System.out.println("********** add all without using addAll() ************");
	  ArrayList<Integer> ob = new ArrayList<Integer>();
	  a1.add(10000);
	  ob.addAll(a1);
	  ob.add(2000);
	  a1.add(12);
	  a1.add(15);
	  a1.add(20);
	   
	  Collections.copy(a1,ob);
	  System.out.println(ob);
	  System.out.println(a1);
	  Collections.reverse(ob);
	  System.out.println(ob);
		//For sum of list
	  Integer sum=0;
	  for(int i=0; i<ob.size(); i++) {
		  sum=sum+ob.get(i);
	  }
	  System.out.println("************Sum is********** "+ sum);
	  
	  a1.get(3);
	  

	  
	  	  //code for thread safe and multithreading
	/*  List<Integer> a1 = Collections.synchronizedList(new ArrayList<>());
	  
        Thread thread1 = new Thread(() -> {
	  for (int i = 0; i < 10; i++) {
          a1.add(i);
          System.out.println("Thread 1 added: " + i);
      }
	  }
	  
	  for (int i = 10; i < 20; i++) {
          a1.add(i);
          System.out.println("Thread 2 added: " + i);
      }*/
	  
  }
  
  @Test
  public void linkedList() {System.out.println("***********LinkedList**************");
	  
	  LinkedList<Integer> a1 = new LinkedList<Integer>();
	  a1.add(12);
	  a1.add(15);
	  a1.add(20);
	  a1.add(10);
	  a1.add(05);
	  System.out.println(a1);
	  	  System.out.println(a1.getFirst());
		System.out.println(a1.getLast());
	  
	  a1.set(2, 15);
	  System.out.println(a1);
	  // add(),clear(),isEmpty(),contains(),size(),addAll()	
	  System.out.println(a1.size());
	  System.out.println(a1.contains(10));
	  System.out.println(a1.isEmpty());
	  //a1.clear();
	  System.out.println(a1);
	  a1.remove(3);
	  System.out.println(a1);
	  a1.add(3,30);
	  System.out.println(a1);
	  a1.addFirst(99);
	  System.out.println(a1);
	  a1.addLast(01);
	  System.out.println(a1);
	  System.out.println(a1.poll()); 		// to Print 1st Element
	  System.out.println(a1.pollLast()); 		// to Print last Element
	  System.out.println("***********");
	  System.out.println(a1);
	  
	  System.out.println("**********************");
	  Collections.sort(a1);
	  System.out.println(a1);
	  
	  System.out.println("**********************");
	  ArrayList<Integer> ob = new ArrayList<Integer>();
	  ob.addAll(a1);
	  Collections.reverse(ob);
	  System.out.println("++++++++++++++++"+ob);
	  
	//For sum of list
	  Integer sum=0;
	  for(int i=0; i<ob.size(); i++) {
		  sum=sum+ob.get(i);
	  }
	  System.out.println("************Sum is********** "+ sum);
	  
	  Iterator<Integer> ir = a1.iterator();
	  while (ir.hasNext()) {
	  System.out.println(ir.next());
	  }
	  
	  
  }

  @Test
  public void stack() {System.out.println("***********Stack**************");
	  // stack extends vector class -- LIFO
	  Stack<Integer> a1 = new Stack<Integer>();
	  a1.add(12);
	  a1.add(15);
	  a1.add(20);
	  a1.add(10);
	  a1.add(05);
	  
	  System.out.println(a1);
/*	  Methods: addElement(Object element), int capacity(), int size(), firstElement(),
 *  lastElement(), get(int index) etc.
 */
	
	  System.out.println( a1.capacity());	// initial capacity = 10; after reach to 20th element its capacity directly double
	  System.out.println( a1.size());
	  System.out.println( a1.lastElement());
	  System.out.println( a1.firstElement());
	  System.out.println( a1.get(3));
	  a1.pop();
	  a1.push(456454);
	  System.out.println(a1.peek());
	  System.out.println(a1);
  }
      




}
