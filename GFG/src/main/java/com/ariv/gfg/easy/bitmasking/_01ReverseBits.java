package com.ariv.gfg.easy.bitmasking;

public class _01ReverseBits {

	public static void main(String[] args) {
		int n = 11;
		System.out.println(reverseBits(n));
	}

	private static void reverseBitsBF(int n) {
		while (n != 0) {
			System.out.print(n % 2);
			n /= 2;
		}
		System.out.println();
		while (n != 0) {
			System.out.print(n % 2);
			n /= 2;
		}
	}
	
	private static int reverseBits(int n) {
		int rev = 0;
		while (n > 0) {
			rev <<= 1;
			
			if((int)(n&1) == 1)
				rev ^= 1;
			
			n >>= 1;
		}
		return rev;
	}
}
