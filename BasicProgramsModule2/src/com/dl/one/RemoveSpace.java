package com.dl.one;

import java.util.Scanner;

public class RemoveSpace {
	
	public void print(String str) {
		//String replace = str.replace(" ", "");
		String replace = str.replaceAll("\\s", "");
		System.out.println(replace);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		RemoveSpace obj = new RemoveSpace();
		obj.print(str);
		
	}

}
