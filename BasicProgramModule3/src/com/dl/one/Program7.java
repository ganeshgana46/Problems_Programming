package com.dl.one;

import java.util.Scanner;

//Product of numbers...?

public class Program7 {
	
	public void print(int[] arr) {
		int prod = 1;
		for(int i=0;i<arr.length;i++) {
			prod = prod * arr[i];
		}
		System.out.println("Product of Numbers : " + prod);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Array : ");
		int[] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		Program7 obj = new Program7();
		obj.print(arr);

	}
	
	//Product of even numbers     -->  if(arr[i] % 2 == 0)
	//Product of odd numbers      -->  if(arr[i] % 2 != 0)
	//Product of 2 digit numbers  -->  if(arr[i]>9 && arr[i]<100)
	//Product of positive numbers -->  if(arr[i] > 0)

}
