package com.java8.lambda;

class ThreadDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("run method called");
	}

}

public class RunnableLambdaDemo {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadDemo());
		thread1.run();

		Runnable runnable = () -> System.out.println("run method called using lambda(1)");
		Thread thread2 = new Thread(runnable);
		thread2.run();

		Thread thread3 = new Thread(() -> System.out.println("run method called using lambda(2)"));
		thread3.run();
	}

}
