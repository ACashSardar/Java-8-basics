package com.java8.lambda.functional;

import java.util.function.Function;

class FunctionImpl implements Function<String, Integer> {

	@Override
	public Integer apply(String t) {
		return t.length();
	}

}

public class FunctionDemo {

	public static void main(String[] args) {

//		Function<String, Integer> function = new FunctionImpl();
//		System.out.println(function.apply("Akash"));

		Function<String, Integer> functionLambda = (str) -> str.length();
		System.out.println(functionLambda.apply("yoo"));

	}

}
