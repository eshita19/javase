package com.esh.j2se.generics;

class NumeralType<T extends Number>{
	T val;
	
	public NumeralType(T val) {
		this.val = val;
	}
	public Double getDoubleValue(){
		return this.val.doubleValue();
	}
}
public class BoundedTypesExample {
	public static void main(String[] args) {
		NumeralType<Integer> numeralType = new NumeralType<Integer>(10);
		System.out.println(numeralType.getDoubleValue());
		NumeralType<Double> doubleType = new NumeralType<Double>(10.4d);
		System.out.println(doubleType.getDoubleValue());
	}
}
