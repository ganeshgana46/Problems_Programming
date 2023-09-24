package com.dl.one;

import java.util.Scanner;

public class PrintDuplicate {
	
	public void print(String str) {
		for(int i=0;i<=str.length()-1;i++) {
			for(int j=i+1;j<=str.length()-1;j++) {
				if(str.charAt(i) == str.charAt(j)) {
					System.out.println(str.charAt(i));
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		PrintDuplicate obj = new PrintDuplicate();
		obj.print(str);

	}

}
