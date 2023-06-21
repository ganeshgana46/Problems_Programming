package com.BasicProgramsModule1;
import java.util.*;
public class PosNeg {
	
	public void print(int number) {
		if(number > 0) {
			System.out.println("The given number is Positive");
		}else if(number < 0) {
			System.out.println("The given number is Negative");
		}else {
			System.out.println("Its Zero");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		PosNeg obj = new PosNeg();
		obj.print(number);

	}

}
