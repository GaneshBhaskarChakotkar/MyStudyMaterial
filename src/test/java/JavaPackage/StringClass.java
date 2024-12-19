package JavaPackage;


import java.util.Scanner;

public class StringClass {
	
	public void swap() {
		

		System.out.println("with 3rd variable");
		String s1="s1";
		String s2="s2";
		String s3=s1;
		s1=s2;
		s2=s3;
		System.out.println("for changed s1: "+s1);
		System.out.println("for changed s2: "+s2);
		
		System.out.println("without 3rd variable");
		String name="Gayatri";
		String Lastname="Wakode";
		name=name.concat(Lastname);
		System.out.println(name);
		Lastname=name.substring(0,(name.length()-Lastname.length()));
		name=name.substring(Lastname.length());
		System.out.println("after swaping name : "+name);
		System.out.println("after swaping lastname : "+Lastname);
	}

	public void containVowels() {// to check whether the string contains vowels:
		String name = "jey";
		boolean cond = name.toLowerCase().matches(".*[aeoiu]*.");
		System.out.println(cond);
		// to check whether the string contains num:
		String mobilenum = "name7507";
		boolean cond2 = mobilenum.matches(".*[0-9]*.");
		System.out.println("mobile mtaches num  :-)"+cond2);
				}
	public static void main(String[] args) {
		
		StringClass obj = new StringClass();
		obj.swap();
		obj.containVowels();

        String original = "raktokahCraksahBhsenaG";
        String reversed = "";
        for (int i=original.length()-1; i>=0; i--) {
        	reversed += original.charAt(i);
        //	System.out.print(original.charAt(i));
        }
    
		System.out.println(reversed);

		System.out.println("*************Literal Way Of String Memory in string constant pool***********");
		String a = "Virat";
		a.concat("kolhi");	// not possible
		String b = "suraj";			// same memory location(if values are same"Virat") with different variable name
		System.out.println(a);
		System.out.println(b);
		
		a.concat(b);	// It is not allowed due to string immuatability
		System.out.println(a);	// Virat
		System.out.println(b);	// Virat
		
		a=a.concat(b);	// It is forcefully allowed due to creating new object in string pool
		System.out.println(a);	// ViratVirat
		System.out.println(b);	// Virat
		
		System.out.println("*************new keyword Way Of String Memory in heap area***********");
		String c = new String("Sachin");
		// All the remaing shit is same
		// Reverse the String content
		System.out.println("***********Reverse String**********");
		String s1 = "Ganesh.chakotkar";
		String[] s2 = s1.split("\\.");
		 s1 = s2[1] + s2[0];
		System.out.println(s1);
	
		String myname = "ganesh";
		StringBuilder br = new StringBuilder(myname).reverse();
		System.out.println(br.toString());
	
		  
		 // swaping int without using 3rd veriable
		 int a1 = 20;
		 int b1= 30;
		 a1=a1+b1;
		 b1=a1-b1;
		 a1=a1-b1;
		 System.out.println(a1);
		 System.out.println(b1);
		
		 // swap String without using third veriable
			System.out.println("how to swap string");
		 String name = "manu";
		 String surname = "Chakotkar";
		 name=name.concat(surname);	//manuChakotkar
		 surname = name.substring(0,name.length()-surname.length());
		 name = name.substring(surname.length());
		 System.out.println(name);
		System.out.println(surname);
		
		String d1= "Ganesha";
		StringBuilder d2 = new StringBuilder(d1).reverse();
		System.out.println(d2.toString());
		
		// to check whether the string contains vowels:
		String input="Visit";
		boolean ct = input.toLowerCase().matches(".*[aeiou]*.");
		System.out.println(ct);
		// to check whether the string contains num:
		String inputnum = "Ganesh213";
		boolean bt = inputnum.matches(".*[0-9]*.");
		System.out.println(bt);
		
		// how to use recursion to calculate a Fibonacci sequence that is 15 numbers long:
		//  A Fibonacci sequence- num == sum of the two previous numbers
		System.out.println("Fibonachi sequence");
		int first = 0;
		int sec = 1;
		int third=1;
		for(int sn=1; sn<=15; sn++){
		System.out.print(first+" ! ");
		first=sec;
		sec=third;
		third=first+sec;
	}
		System.out.println();	// move control to next line

		int y1=15,x1=0, x2=1, x3=1;
		for (int i=1; i<y1; i++) {
			System.out.print(x1 + " ");	//0	 1	1	2	3...
			x1=x2;		//	1	1	2	3		
			x2=x3;		//	1	2	3	5  
			x3=x1+x2;	//	2	3	5	8
		}
		System.out.println();	// move control to next line
		
		// A palindrome string is the same string backwards or forwards.
		// To check for a palidrome
		
		Scanner mc = new Scanner(System.in);
		System.out.print("Enter your String : ");
		String s51 = mc.nextLine();
		int count = 0;
		for(int i=0; i<s51.length()/2; i++){
			if(s51.charAt(i)!=(s51.charAt(s51.length()-1-i))){
				count++;
				break;
			}
		}
		if(count==0){
		System.out.println("this is yahoooo : "+s51);
		}
		Scanner mysc = new Scanner(System.in);
		System.out.print("Enter your String : ");
		String mystr = mysc.nextLine();
		boolean dj = true;
		for(int i=0; i<mystr.length()/2; i++) {
			if(mystr.charAt(i)!=(mystr.charAt(mystr.length()-i-1))) {
					dj=false;
				break;
			}
		}
		System.out.println(dj);
		
		//Even odd check
		Scanner mysc1 = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int myint = mysc1.nextInt();

		if(myint%2==0) {
			System.out.println("this is even number "+myint);
		}else {
			System.out.println(myint+" this is odd number ");
		}
		
		String trimmable = "   jhfjk  dgd  asdga  ";
		trimmable=trimmable.trim();
		System.out.println(trimmable);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	

}
