package com.dl.one;

import java.util.Scanner;

//print sum of numbers...?

public class Program6 {
	
	public void print(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of Numbers : " + sum);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Array : ");
		int[] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		Program6 obj = new Program6();
		obj.print(arr);

	}
	
	//Sum of even numbers     -->  if(arr[i] % 2 == 0)
	//Sum of odd numbers      -->  if(arr[i] % 2 != 0)
	//Sum of 2 digit numbers  -->  if(arr[i]>9 && arr[i]<100)
	//Sum of positive numbers -->  if(arr[i] > 0)

}
