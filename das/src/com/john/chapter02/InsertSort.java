package com.john.chapter02;

import com.john.util.Sort;
import com.john.util.Test10000;

public class InsertSort implements Sort {

	@Override
	public void sort(int[] data) {
		
		if(data == null || data.length < 2) {
			return;
		}
		int length = data.length;
		int out, in;
		
		for(out = 1; out < length; out++) {			
			int temp = data[out];			
			in = out;			
			while(in > 0 && data[in - 1] > temp) {
				data[in] = data[in - 1];
				--in;
			}			
			data[in] = temp;
		}
		
	}
	
	public static void main(String[] args) {
		Test10000.test(new SelectionSort());
	}

}
