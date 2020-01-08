package com.esh.j2se.generics;

public class GenericMethodsExample {
    private int val;
    //Generic constructor
	public <T extends Integer> GenericMethodsExample(T val) {
		this.val = val;
	}
	public static void main(String[] args) {
		GenericMethodsExample example = new GenericMethodsExample(3);
		System.out.println(getVal("eshita"));
		System.out.println(getVal(1));
	}
	
	//Generic method
	public static <T> T getVal(T val){
		System.out.println(val.toString());
		return val;
	}
}
