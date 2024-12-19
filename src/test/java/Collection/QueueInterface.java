package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

import org.testng.annotations.Test;

public class QueueInterface {
  @Test
  public void PrirityQueClass()  {
	  /* it always add data in ascending order or alfabetical order (capital first)
	   * it will poll 1st added element from the queue
	   * Methods: boolean add(object), boolean offer(object), boolean remove(object), Object poll(), 
	   * Object element() , Object peek(), void clear(), int size()
	   */
	  PriorityQueue<String> a1 = new PriorityQueue<String>();
	  a1.add("a");
	  a1.add("b");
	  a1.add("f");
	  a1.add("d");
	  a1.add("e");
	  a1.offer("c");
	  System.out.println(a1);
	  System.out.println(a1.poll());
	  System.out.println(a1.element());
	  
  }
  
  @Test
  public void DequeInterfaceUseArrayDequeClass() {
	  /* 
	   * Deque interface extends the Queue interface. 
	   * In Deque, we can remove and add the elements from both the side. 
	   * Deque stands for a double-ended queue which enables us 
	   * to perform the operations at both the end 
	   * 
	   */
	  Deque<String> a1 = new ArrayDeque<String>();
	  a1.add("a");
	  a1.add("b");
	  a1.add("f");
	  a1.add("d");
	  a1.add("e");
	  a1.add("c");
	  System.out.println(a1);
	  System.out.println(a1.pop());
	  System.out.println(a1);
	  a1.poll();
	  System.out.println(a1);
	  System.out.println(a1.peek());
	  System.out.println(a1);



  }
  
  @Test
  public void DequeInterfaceUseLinkedListClass() {
	  /* 
	   * Deque interface extends the Queue interface. 
	   * In Deque, we can remove and add the elements from both the side. 
	   * Deque stands for a double-ended queue which enables us 
	   * to perform the operations at both the end 
	   * 
	   */
	  Deque<String> a1 = new LinkedList<String>();
	  a1.add("a");
	  a1.add("b");
	  a1.add("f");
	  a1.add("d");
	  a1.add("e");
	  a1.add("c");
	  System.out.println(a1);
	  System.out.println(a1.poll());
	  a1.offer("gana");
	  System.out.println(a1);
	  
	  
  }
  
  
  
  
  
  
  
}
