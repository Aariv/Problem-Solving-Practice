package com.ariv.gfg.easy.math;

public class _03TrailngZerosInFactorial {

	public static void main(String[] args) {
		int N = 300;
		int result = trailingZeros(N);
		System.out.println(result);
	}

	private static int trailingZerosBruteForce(int n) {
		int fact = 1;
		for (int i = 1; i <= n; ++i) {
			fact = fact * i;
		}
		System.out.println("The "+ n + "! is: " + fact);
		int zero = 0;
		while(fact != 0) {
			int last = fact % 10;
			if(last == 0) {
				zero++;
			}
			fact = fact / 10;
		}
		return zero;
	}
	
	private static int trailingZeros(int n) {
		if(n < 0) {
			return -1;
		}
		int count = 0;
		
		for(int i = 5; n / i >= 1; i *= 5) {
			count += n / i;
		}
		return count;
	}
}
