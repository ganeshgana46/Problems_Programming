package com.BasicProgramsModule1;
import java.util.*;
public class SeparateDigits {
	
	public void print(int number) {
		while(number!=0) {
			System.out.println(number%10);
			number = number/10;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		SeparateDigits obj = new SeparateDigits();
		obj.print(number);

	}

}
