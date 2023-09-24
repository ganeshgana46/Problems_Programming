package com.dl.one;

import java.util.Arrays;
import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Array : ");
		int[] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		
		System.out.println("Sorted Array : " + Arrays.toString(arr));
		
		//int size = arr.length;
		//int res = arr[size-2];
		
		
		System.out.println("Second Largest Number : " + arr[arr.length-2]);
	}

}
