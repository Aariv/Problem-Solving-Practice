package com.ariv.epi.arrays;

/**
 * 
 * Range and Coefficient of range of Array
 * 
 * Given an array arr of integer elements, 
 * the task is to find the range and coefficient of range of the given array where:
 * 
 *  Range: Difference between the maximum value and the minimum value in the distribution. 
 *  Coefficient of Range: (Max – Min) / (Max + Min).
 *
 *  Range = Max – Min
 *  Coefficient of Range = (Max – Min) / (Max + Min)
 */
public class _08Question {

	public static void main(String[] args) {
		int[] arr = {15, 16, 10, 9, 6, 7, 17} ;
		
		rangeAndCoEffRange(arr);
	}

	private static void rangeAndCoEffRange(int[] arr) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		
		for(int ele: arr) {
			if(ele < min) {
				min = ele;
			}
			if(ele > max) {
				max = ele;
			}
		}
		
		double range = (double) max - min;
		double coefficient = (double) range / (max + min);
		System.out.printf("%.2f%n", range);
		System.out.printf("%.5f", coefficient);
	}
}
