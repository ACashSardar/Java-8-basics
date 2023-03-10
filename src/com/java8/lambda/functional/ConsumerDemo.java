package com.java8.lambda.functional;

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}

public class ConsumerDemo {

	public static void main(String[] args) {

//		Consumer<String> consumer = new ConsumerImpl();
//		consumer.accept("Hello World");

		Consumer<String> consumerLambda = (s) -> System.out.println(s);
		consumerLambda.accept("Good Luck");
	}

}
