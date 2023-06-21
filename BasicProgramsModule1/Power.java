package com.BasicProgramsModule1;
import java.util.*;
public class Power {
	
	public void print(int base,int exponent) {
		long result = 1;
		for(int i=1;i<=exponent;i++) {
			result = result * base;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base : ");
		int base = sc.nextInt();
		
		System.out.println("Enter the exponent : ");
		int exponent = sc.nextInt();
		
		Power obj = new Power();
		obj.print(base, exponent);

	}

}
