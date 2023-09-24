package com.dl.one;

import java.util.Scanner;

public class ReverseString {
	
	public void print(String str) {
		for(int i=str.length()-1; i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		ReverseString obj = new ReverseString();
		obj.print(str);
		
	}

}
