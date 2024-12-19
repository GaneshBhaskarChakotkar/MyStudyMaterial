package Collection;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.*;

import org.testng.annotations.AfterTest;

public class MapInterface {
  @Test
  public void f4() {
	  
  }
  
  @Test
  public void f3() {
	  
	  Map<String,Integer> map = new TreeMap<>();
	  map.put("one",21);
	  map.put("two",22);
	  map.put("five",25);
	  map.put("four",24);
	  map.put("three",23);
	  System.out.println("Value for 'two': " +map.get("two"));
	  System.out.println(map);
	  System.out.println("Contains 'three': " + map.containsKey("three"));
	  for(Map.Entry<String, Integer> i : map.entrySet()) {
		  System.out.println(i.getKey()+i.getValue());
	  }
	  // Removing a key-value pair
      map.remove("one");
	  
	  
  }
  
  @Test
  public void f2() {
	  
	  Map<String,Integer> map = new LinkedHashMap<>();
	  map.put("one",21);
	  map.put("two",22);
	  map.put("five",25);
	  map.put("four",24);
	  map.put("three",23);
	  System.out.println(map.get("two"));
	  System.out.println(map);
	  for(Map.Entry<String, Integer> i : map.entrySet()) {
		  System.out.println(i.getKey());
		  
	  }
	  
	  	  
  }
  
  @Test
  public void f1() {
	  
	  Map<String,Integer> map = new HashMap<>();
	  map.put("one",21);
	  map.put("two",22);
	  map.put("five",25);
	  map.put("four",24);
	  map.put("three",23);
	  System.out.println(map.get("two"));
	  System.out.println(map);
	  for(Map.Entry<String, Integer> i : map.entrySet()) {
		  System.out.println(i.getKey());
		  
	  }

	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
