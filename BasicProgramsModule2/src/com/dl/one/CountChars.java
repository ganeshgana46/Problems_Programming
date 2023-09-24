package com.dl.one;

import java.util.Scanner;

public class CountChars {
	
	public void print(String str) {
		int count = str.length();
		System.out.println("Number of Characters : " + count);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		CountChars obj = new CountChars();
		obj.print(str);
	}

}
