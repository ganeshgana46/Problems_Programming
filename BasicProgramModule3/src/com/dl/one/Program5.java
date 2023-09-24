package com.dl.one;

import java.util.Scanner;

//square root of numbers...?

public class Program5 {
	
	public void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%.2f\n",Math.sqrt(arr[i]),3);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Array : ");
		int[] arr = new int[3];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		Program5 obj = new Program5();
		obj.print(arr);

	}

}
