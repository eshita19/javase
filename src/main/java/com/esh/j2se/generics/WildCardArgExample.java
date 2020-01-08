package com.esh.j2se.generics;

class MyType<T extends Number>{
	T val;
	
	public MyType(T val) {
		this.val = val;
	}
	public  T getVal(){
		return this.val;
	}
	public boolean sameVal(MyType<?> myType2){
		return  this.val == myType2.getVal();
	}
}
public class WildCardArgExample {
	public static void main(String[] args) {
		MyType<Integer> intType = new MyType<>(10);
		MyType<Float> floatType = new MyType<>(12.5f);
		//intType = strType; Compilation error. 
		System.out.println(intType.sameVal(floatType));
	}
}
