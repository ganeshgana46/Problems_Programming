package com.dl.one;

import java.util.Arrays;
import java.util.Scanner;

public class Program12 {
	
	public void print(String str1, String str2) {
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean result = Arrays.equals(arr1, arr2);
		
		if(result) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not a Anagram");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String 1 : ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the String 2 : ");
		String str2 = sc.nextLine();
		
		Program12 obj = new Program12();
		obj.print(str1, str2);

	}

}
