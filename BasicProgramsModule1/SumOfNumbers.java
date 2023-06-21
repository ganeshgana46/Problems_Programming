package com.BasicProgramsModule1;
import java.util.*;
public class SumOfNumbers {
	
	public void addNumbers(int number) {
		int sum = 0;
		for(int i=0;i<=number;i++) {
			sum = sum + i;
		}
		System.out.println("Sum Of the Number : " + sum);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		
		SumOfNumbers obj = new SumOfNumbers();
		obj.addNumbers(number);

	}

}
