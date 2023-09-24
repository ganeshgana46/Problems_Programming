package com.dl.one;

import java.util.Scanner;

public class ReverseEW {
	
	public void print(String org_str) {
		String rev_str = "";
		String[] words = org_str.split(" ");
		for(String word : words) {
			String rev_word = "";
			for(int i=word.length()-1;i>=0;i--) {
				rev_word = rev_word + word.charAt(i);
			}
			rev_str = rev_str + rev_word + " ";
		}
		System.out.println(rev_str);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String org_str = sc.nextLine();
		
		ReverseEW obj = new ReverseEW();
		obj.print(org_str);
		
	}

}
