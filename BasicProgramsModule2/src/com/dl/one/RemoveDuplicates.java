package com.dl.one;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
        String str = "programming";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(str.indexOf(ch)==i) {
				sb.append(ch);
			}
		}
		System.out.println(sb);

	}

}
