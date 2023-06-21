package com.BasicProgramsModule1;
import java.util.*;
public class SwapNumbers {
	
	public void swap(int num1,int num2) {
		int
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("NUmber1 : " + num1);
		System.out.println("Number2 : " + num2);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the number2 : ");
		int num2 = sc.nextInt();
		
		SwapNumbers obj = new SwapNumbers();
		obj.swap(num1, num2);
		

	}

}
