package javaBasicLearn;

import java.util.Scanner;

public class SwichCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("enter value of a");
		a = sc.nextInt();
		System.out.println("enter value of b");
		b = sc.nextInt();
		System.out.println("enter a character operator");
		char op  = sc.next().charAt(0);
		
	     switch(op) {
	     case  '+' :
	    	 System.out.println(a+b);
	    	 break;
	     case '-':
	    	 System.out.println(a-b);
	    	 break;
     	default :
		   System.out.println("invalid Operator");
		}

	}

}
