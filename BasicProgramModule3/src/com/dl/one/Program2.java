package com.dl.one;

import java.util.Scanner;

//Print even OR odd elements from array...?

public class Program2 {
	
	public void print(int[] arr) {
		//for even elements
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 0) {
				System.out.println("Even Element From Array : " + arr[i]);
			}
		}
		//for odd elements
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 != 0) {
				System.out.println("Odd Element From Array : " + arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array : ");
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		Program2 obj = new Program2();
		obj.print(arr);
	}

}
