package com.BasicProgramsModule1;
import java.util.*;
public class Table {
	
	public void print(int number) {
		for(int i=1;i<=10;i++) {
			System.out.printf("%d * %d = %d",number,i,number*i).println();
		}
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number : ");
	int number = sc.nextInt();
	
	Table obj = new Table();
	obj.print(number);
	}

}
