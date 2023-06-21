package com.BasicProgramsModule1;
import java.util.*;
public class EvenOdd {
	
	public void print(int number) {
		if(number % 2 == 0) {
			System.out.println("The given number is even");
		}else {
			System.out.println("The given number is odd");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		EvenOdd obj = new EvenOdd();
		obj.print(number);
	}

}
