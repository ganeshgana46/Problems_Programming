package com.dl.one;

//print even index & odd index numbers...?

import java.util.Scanner;

public class Program3 {
	
	public void print(int[] arr) {
		//for even index
		for(int i=0;i<=arr.length-1;i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Array : ");
		int[] arr = new int[10];
		
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = sc.nextInt();
		}
		
		Program3 obj = new Program3();
		obj.print(arr);

	}

}
