package com.john.util;

import java.util.Arrays;
import java.util.Random;

public class Test10000 {
	
	public static void test(Sort sort) {
		
		int[] data = new int[100000];
		Random r = new Random();
		for(int i = 0; i < 100000; i++) {
			data[i] = r.nextInt();
		}
		
		System.out.println("冒泡排序开始... " );
		Long start = System.currentTimeMillis();
		sort.sort(data);
		System.out.println("冒泡排序结束 ..., 耗时:  " + (System.currentTimeMillis() - start) + "ms");
		
//		for(int d : data) {
//			System.out.println(d);
//		}
	}
}
