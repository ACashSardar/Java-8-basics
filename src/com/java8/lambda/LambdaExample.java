package com.java8.lambda;

interface Shape {
	void draw();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle Class: draw method");

	}

}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square Class: draw method");

	}

}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle Class: draw method");

	}

}

public class LambdaExample {

	public static void print(Shape shape) {
		shape.draw();
	}

	public static void main(String[] args) {

//		Shape rectangle = new Rectangle(); // traditional method(many lines of code)

		Shape rectangle = () -> {
			System.out.println("Draw method: lambda");
		};

		rectangle.draw();
		print(rectangle);
	}

}
