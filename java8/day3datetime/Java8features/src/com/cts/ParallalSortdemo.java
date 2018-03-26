package com.cts;

import java.util.Arrays;

public class ParallalSortdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]={5,2,3,1,4,8,9};
		
		//Arrays.sort(a);
		
		for( int x:a)
		System.out.println(x);

		//Arrays.parallelSort(a);
		
		for( int x:a)
		System.out.println(x);
		
Arrays.parallelSort(a,0,3);
		
System.out.println("after sorting=========");
		for( int x:a)
		System.out.print(" "+x);
	}

}
