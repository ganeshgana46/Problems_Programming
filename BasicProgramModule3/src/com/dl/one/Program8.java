package com.dl.one;

//count numbers...?

import java.util.Scanner;

public class Program8 {
	
	public void print(int[] arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			count++;
		}
		System.out.println("Count : " + count);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Array : ");
		int[] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		Program8 obj = new Program8();
		obj.print(arr);
		
	}
	
	//Count of even numbers     -->  if(arr[i] % 2 == 0)
	//Count of odd numbers      -->  if(arr[i] % 2 != 0)
	//Count of 2 digit numbers  -->  if(arr[i]>9 && arr[i]<100)
	//Count of positive numbers -->  if(arr[i] > 0)

}
