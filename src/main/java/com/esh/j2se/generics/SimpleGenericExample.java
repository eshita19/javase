package com.esh.j2se.generics;

class MyType<T>{
	T val;
	
	public MyType(T val) {
		this.val = val;
	}
	public T getVal(){
		return val;
	}
}
public class SimpleGenericExample {

	public static void main(String[] args) {
		MyType<Integer> intType = new MyType<>(10);
		MyType<String> strType = new MyType<>("eshita");
		//intType = strType; Compilation error. 
		System.out.println(intType.getVal() + " " + strType.getVal());
	}
}
