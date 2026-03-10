package Basic_programme;

import java.util.Scanner;

public class Program1 {
	
	public static void main(String[] args) {
//		System.out.println("Hello World");
//		
//		int i=10;
//		String s="Prachi";
//		char c='G';
//		double d=253.25;
//	
//	  System.out.println("Int value is :" +i +"\n" +"String value is :"+s+"\n"+"char value is :"+c+"\n"+"double value is :"+d);	
//	
		
//		Take input from user
//		define scanner class
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Integer value :");
		int id =scn.nextInt();
		System.out.println("Enter double value :");
		double d = scn.nextDouble();
		System.out.println("Enter char value");
		char c = scn.next().charAt(0);
		System.out.println("Enter string value");
		String s =scn.next();
		
		System.out.println("Integer Value :"+id+"\n"+"Double vlaue : "+d+"\n"+"Character Value :"+c+"\n"+"String Value :"+s);
		
		
		
	}

}
