package com.java8.lambda.functional;

import java.util.function.Supplier;

class SupplierImpl implements Supplier<String> {

	@Override
	public String get() {
		return "Hello Akash";
	}

}

public class SupplierDemo {

	public static void main(String[] args) {

//		Supplier<String> supplier = new SupplierImpl();
//		System.out.println(supplier.get());

		Supplier<String> supplierLambda = () -> "Hola Akash";
		System.out.println(supplierLambda.get());
	}

}
