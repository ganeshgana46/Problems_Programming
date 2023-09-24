package com.dl.one;

import java.util.Scanner;

//print only two digit numbers...?

//Positive Numbers --> if(arr[i] > 0)
//divisible by 5   --> if(arr[i] % 5 ==0)
//Ending with 7    --> if(arr[i] % 10 ==7
 
public class Program4 {
	
	public void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>9 && arr[i]<100) {
				System.out.println(arr[i]);
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
		
		Program4 obj = new Program4();
		obj.print(arr);

	}

}
