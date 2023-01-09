package com.java8.lambda;

@FunctionalInterface // checks if there is exactly one abstract method
public interface MyFunctionalInterface {
	void print(String msg);

	default void m1() {
		System.out.println("default method : m1");
	}

	static void m2() {
		System.out.println("static method : m2");
	}
}
