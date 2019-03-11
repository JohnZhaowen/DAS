package com.john.chapter02;

import com.john.util.Sort;
import com.john.util.Swap;
import com.john.util.Test10000;

public class SelectionSort implements Sort {
	
	public void sort(int[] data) {	
		if(data == null || data.length < 2) {
			return;
		}
		int length = data.length;
		int out, in, min;
		
		for(out = 0; out < length - 1; out ++) {
			min = out;
			for(in = out + 1; in < length; in++) {
				if(data[min] > data[in]) {
					min = in;
				}
			}
			Swap.swap(out, min, data);
		}
	}
	
	public static void main(String[] args) {
		Test10000.test(new SelectionSort());
	}
}
