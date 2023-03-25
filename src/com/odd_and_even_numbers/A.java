package com.odd_and_even_numbers;
import java.util.Scanner;
public class A {
	public static void main(String args[]) {
	
	//Scanner class if for user input	
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the number within you want to see the odd and even number:");
	 int num=scan.nextInt();
	
	 //Below code is to print Even numbers
	 int a=1;
	 System.out.println("Even numbers:");
	 while(a<=num) {
		 
		 if(a%2==0) {
			 System.out.print(a+",");
		 }
		 a++;
	 }
	 
	 //below code is to print Odd numbers
	 a=0;
	 System.out.println();
	 System.out.println("Odd numbers:");
     while(a<=num) {
		 
		 if(a%2!=0) {
			 System.out.print(a+",");
		 }
		 a++;
	 }	 
   }
}
