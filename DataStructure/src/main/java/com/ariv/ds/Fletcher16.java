package com.ariv.ds;

import java.util.Scanner;

public class Fletcher16 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the number of lines, followed by the input:");
			int numLines = s.nextInt();
			s.nextLine();
			short[] checksums = new short[numLines];
			for (int i = 0; i < numLines; ++i) {
				checksums[i] = checksum(s.nextLine());
			}
			
			/*
			 * This block is to print number of items
			 * 
			 * 
			 */
			
			/**
			 * 
			 */
			for (int i = 0; i < numLines; ++i) {
				System.out.println((i + 1) + " " + Integer.toHexString(checksums[i] & 0xffff).toUpperCase());
			}
		}
	}

	public static short checksum(String line) {
		byte[] bytes = line.getBytes();
		short sum1 = 0;
		short sum2 = 0;
		for (int i = 0; i < bytes.length; ++i) {
			sum1 = (short) ((sum1 + bytes[i]) % 255);
			sum2 = (short) ((sum2 + sum1) % 255);

		}
		return (short) ((sum2 << 8) | sum1);
	}

}