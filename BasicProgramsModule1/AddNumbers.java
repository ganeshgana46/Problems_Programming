package com.BasicProgramsModule1;
import java.util.*;
public class AddNumbers {
	
	public void add(int num1,int num2) {
		int sum = num1 + num2;
		System.out.println("Sum of The numbers : " + sum);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the Number2 : ");
        int num2 = sc.nextInt();
        
        AddNumbers obj = new AddNumbers();
        obj.add(num1, num2);
        
	}

}
