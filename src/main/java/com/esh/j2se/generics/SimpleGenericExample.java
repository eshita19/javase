package com.esh.j2se.generics;

class MyGenericType<T>{
	T val;
	
	public MyGenericType(T val) {
		this.val = val;
	}
	public T getVal(){
		return val;
	}
}
public class SimpleGenericExample {

	public static void main(String[] args) {
		MyGenericType<Integer> intType = new MyGenericType<>(10);
		MyGenericType<String> strType = new MyGenericType<>("eshita");
		//intType = strType; Compilation error. 
		System.out.println(intType.getVal() + " " + strType.getVal());
	}
}
