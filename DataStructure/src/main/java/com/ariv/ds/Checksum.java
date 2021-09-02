package com.ariv.ds;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * A Class used for calculating checksums
 * 
 */
public class Checksum {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/al/Downloads/dataset1.txt");
		File outFile = new File("/Users/al/Downloads/dataset1Result.txt");
		BufferedWriter out = new BufferedWriter(new FileWriter(outFile));
		Scanner scanner = new Scanner(file);
		LinkedList<String> lineList = new LinkedList<String>();

		while (scanner.hasNext()) {
			lineList.add(scanner.nextLine());
		}
		scanner.close();
		Iterator<String> iterator = lineList.iterator();
		int i = 1;
		// 4573500506000004047a6e126100eed1f268eb2de68d20a2f05b24842ef0e379976596733f20ee9143936adf5536f230c24b00005ee8000000000000000000000000000000000000000000000000000000000093c1
		while (iterator.hasNext()) {
			String data = iterator.next();
			// System.out.println(i++ + ") " + data);
			String hexData = checksum(data, i);
			System.out.println(i++ + ") " + hexData);
			out.write(i++ + ") " + hexData);
			out.newLine();
		}
		out.close();
	}

	private static String checksum(String data, int limit) {
		if (limit >= 10 && limit < 20) {
			return data.substring(data.length() - 8, data.length() - 4);
		} else if (limit >= 20 && limit < 30) {
			return data.substring(data.length() - 12, data.length() - 8);
		}
		return data.substring(data.length() - 4);
	}

}