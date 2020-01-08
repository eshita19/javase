package com.esh.j2se.generics;

interface  MinMax<T extends Comparable<T>>{
	T min();
	T max();
}

class MyClass<T extends Comparable<T>> implements MinMax<T>{
	T[] vals;
	MyClass(T[] vals){
		this.vals = vals;
	}
	@Override
	public T min() {
		T min = vals[0];
		for(T  val : vals){
			if(val.compareTo(min) < -1){
				min = val;
			}
		}
		
		return min;
	}

	@Override
	public T max() {
		T max = vals[0];
		for(T  val : vals){
			if(val.compareTo(max) > 0){
				max = val;
			}
		}
		
		return max;
	}
	
}
public class GenericInterfaceExample {

	public static void main(String[] args) {
		Integer[] vals = {1,2,3};
		MyClass<Integer> myIntClass = new MyClass<>(vals);
		System.out.println(myIntClass.min());
		System.out.println(myIntClass.max());
		
	}
}
