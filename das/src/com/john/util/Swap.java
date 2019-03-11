package com.john.util;

public class Swap {
	public static void swap(int a, int b, int[] data) {
		int temp = data[a];
		data[a] = data[b];
		data[b] = temp;
	}
}
