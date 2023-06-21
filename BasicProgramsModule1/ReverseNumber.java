package com.BasicProgramsModule1;
import java.util.*;
public class ReverseNumber {
	
	public void print(int num) {
		int backup = num;
		int rev = 0;
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		if(backup == rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		ReverseNumber obj = new ReverseNumber();
		obj.print(num);
		
	}

}
