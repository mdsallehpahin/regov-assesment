package com.section1;

import java.math.BigInteger;

public class QuestionOne {

	public static void main(String[] args) {
		final int n = 100;
		BigInteger res = BigInteger.valueOf(1);
		for(int i=1; i<=n; i++) {
			res = res.multiply(BigInteger.valueOf(i));
		}
		String factorialStr = res.toString();
		int sum = 0;
		for (int a = 0; a < factorialStr.length(); a++){
		    int no = Integer.parseInt(String.valueOf(factorialStr.charAt(a)));
		    sum = sum + no;
		}
		System.out.println("Sum of !"+n+" = "+sum);
	}

}
