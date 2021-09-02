package com.ariv.ds;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * A Class used for calculating Fletcher-16 checksums
 * 
 * @author Aftab Khan
 */
public class Checksum2 {

	/**
	 * Calculates the Fletcher-16 checksum of Strings read via console input and
	 * prints the results to the console
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("/Users/al/Downloads/dataset1.txt");
		Scanner scanner = new Scanner(file);
		LinkedList<String> lineList = new LinkedList<String>();

		while (scanner.hasNext()) {
			lineList.add(scanner.nextLine());
		}
		scanner.close();
		Iterator<String> iterator = lineList.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			short checksum = fletcher16_opt(iterator.next().getBytes());
			// Bitmask short to int
			System.out.println(Integer.toHexString(checksum & 0xffff));
		}
		String val1 = "4573500506000004047a6e126100eed1f268eb2de68d20a2f05b24842ef0e379976596733f20ee9143936adf5536f230c24b00005ee8000000000000000000000000000000000000000000000000000000000093c1";
		short checksum = fletcher16_opt(val1.getBytes());
		// Bitmask short to int
		System.out.println(Integer.toHexString(checksum & 0xffff));
	}

	/**
	 * Calculates the Fletcher-16 checksum of a byte array
	 * 
	 * @param data The byte array representation of the data
	 */
	private static short fletcher16(byte[] data) {
		short sum1 = 0;
		short sum2 = 0;
		short modulus = 255;

		for (int i = 0; i < data.length; i++) {
			sum1 = (short) ((sum1 + data[i]) % modulus);
			sum2 = (short) ((sum2 + sum1) % modulus);
		}
		return (short) ((sum2 << 8) | sum1);
	}

	/**
	 * Calculates the Fletcher-16 checksum of a byte array, using an optimized
	 * implementation of the Fletcher checksum algorithm
	 * 
	 * @param data The byte array representation of the data
	 */
	private static short fletcher16_opt(byte[] data) {
		int length = data.length;
		short sum1 = 0xff;
		short sum2 = 0xff;
		int i = 0;

		while (length > 0) {
			int tlen = (length > 170) ? 170 : length;
			length -= tlen;
			do {
				sum2 += sum1 += data[i];
				i++;
			} while ((--tlen) > 0);
			sum1 = (short) ((sum1 & 0xff) + (sum1 >> 16));
			sum2 = (short) ((sum2 & 0xff) + (sum2 >> 16));
		}
		/* Second reduction step to reduce sums to 8 bits */
		sum1 = (short) ((sum1 & 0xff) + (sum1 >> 16));
		sum2 = (short) ((sum2 & 0xff) + (sum2 >> 16));
		return (short) (sum2 << 16 | sum1);
	}
}