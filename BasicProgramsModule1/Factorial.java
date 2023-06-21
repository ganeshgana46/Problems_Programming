package com.BasicProgramsModule1;
import java.util.*;
public class Factorial {
	
	public void fact(int number) {
		int fact =1;
		for(int i=1;i<=number;i++) {
			fact = fact * i;
		}
		System.out.println("Factorial Of Number : " + fact);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		Factorial obj = new Factorial();
		obj.fact(number);

	}

}
