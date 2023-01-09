package com.java8.lambda;

interface Addable {
	int addition(int a, int b);
}

class AddableImpl implements Addable {

	@Override
	public int addition(int a, int b) {
		return a + b;
	}

}

public class LambdaParameters {

	public static void main(String[] args) {

//		Addable addition = new AddableImpl(); // traditional method

		// Using lambda (with params)
		Addable addition = (a, b) -> a + b;
		
		System.out.println(addition.addition(4, 6));
	}

}
