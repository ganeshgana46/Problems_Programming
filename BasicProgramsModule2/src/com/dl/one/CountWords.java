package com.dl.one;

import java.util.Scanner;

public class CountWords {
	
	public void print(String str) {
		int count = 1;
		for(int i=0; i<=str.length()-1;i++) {
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println("Number of Words : " + count);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		CountWords obj = new CountWords();
		obj.print(str);
		
	}

}
