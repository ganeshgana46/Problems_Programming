package com.dl.one;

import java.util.Scanner;

public class Palindrome {
	
	public void print(String org_str) {
		String rev_str = "";
		for(int i=org_str.length()-1;i>=0;i--) {
			rev_str = rev_str + org_str.charAt(i);
		}
		if(org_str.equals(rev_str)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String org_str = sc.nextLine();
		
		Palindrome obj = new Palindrome();
		obj.print(org_str);
	}

}
