package com.dl.one;

public class CountOccurence {
	
	public void print() {
		String str = "Hello World";
		int count = 0;
		for(int i=0; i<=str.length()-1;i++) {
			if(str.charAt(i) == 'l') {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		CountOccurence obj = new CountOccurence();
		obj.print();
		
	}

}
