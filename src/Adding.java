    /*
     * Adding two integers without any arithmetic operator and using recursion.
     * This solution also uses XOR and AND bitwise and << left shift bitshift
     * operator
     */ 

import java.util.Scanner; // teext scanner package
 
 public class Adding {
  
    public static void main(String args[]) {
      
       	Scanner sc=new Scanner(System.in); //invoke Constructor of Scanner class with argument System.in
	
	System.out.println("Enter the value of a ");
	int a = sc.nextInt(); //taking value a from the user
	
	System.out.println("Enter the value of b ");
	int b = sc.nextInt(); // taking the value b from the user
	
	int c = add(a,b); // calling the function method add
	System.out.println("Sum of two numbers is ");
	System.out.println(c); //printing the result
    
	sc.close(); // method to close the scanner , good practice
    }  
  

    public static int add(int x, int y){
     int p, q; //using temp variables p,q
    do {
        p = x & y; // p is x AND y 
        q = x ^ y; // p is x XOR y
        x = p << 1; // left shift p
        y = q; 
    } while (p != 0); // recursively checking value of p so all bits of x are operated
    return q;
    }
 

    
 
}


