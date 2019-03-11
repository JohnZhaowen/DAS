package com.john.chapter02;

import com.john.util.Sort;
import com.john.util.Swap;
import com.john.util.Test10000;

public class BubbleSort implements Sort{
	
	public void sort(int[] data) {
		if(data == null || data.length < 2) {
			return;
		}
		int length = data.length;
		
		int out, in; //遍历标识
		for(out = length - 1; out > 0; out--) {			
			for(in = 0; in < out; in++) {				
				if(data[in] > data[in + 1]) {
					Swap.swap(in, in + 1, data);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Test10000.test(new BubbleSort());
	}

}
