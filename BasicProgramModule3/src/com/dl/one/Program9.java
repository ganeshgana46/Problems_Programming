package com.dl.one;

import java.util.Scanner;

//Print max and min number in the array...?

public class Program9 {
	
	public void print(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Maximum : " + max);
		System.out.println("Minimum : " + min);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array : ");
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		Program9 obj = new Program9();
		obj.print(arr);
		
	}

}
