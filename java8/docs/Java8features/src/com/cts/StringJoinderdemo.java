package com.cts;

import java.util.StringJoiner;

public class StringJoinderdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringJoiner sj=new StringJoiner(",","[","]");
		sj.add("java");
		sj.add("jee");
		sj.add("Webservices");
		System.out.println(sj);
		StringJoiner sj1=new StringJoiner("/","[","]");
		sj1.add("oracle");
		String emptyValue="";
		sj1.setEmptyValue(emptyValue);
		sj1.add("mysql");
		sj1.add("Spring");
		System.out.println(sj1);
		StringJoiner sj2=sj.merge(sj1);
		System.out.println(sj2);
		String s=sj2.toString();
		System.out.println(sj2.length());
		
		
	}

}
