package com.dl.one;

//User input for array & print array element separately...?

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array : ");
		int[] arr = new int[5];
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
