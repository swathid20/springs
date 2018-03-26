package com.cts;

class Test<ss> {
	 ss my;
	 public Test(ss my) {
	 this.my = my;
	 }
	 public ss get() {
	 return my;
	 }
	}
	public class RunTest {
	 public static void main(String[] args) {
	 Integer i = new Test<Integer>(1).get();
	 System.out.println(i.getClass());
	 }
	}