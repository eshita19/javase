package com.esh.j2se.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.TYPE })
@interface MyAnn {
	String val() default "eshita";
}

@MyAnn(val = "mathur")
public class ClassAnnotation {

	public static void main(String[] args) {
		ClassAnnotation ann = new ClassAnnotation();
		System.out.println(ann.getClass().getAnnotation(MyAnn.class).val());
	}
}
