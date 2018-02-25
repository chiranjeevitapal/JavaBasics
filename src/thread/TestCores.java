package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCores {
	public static void main(String args[]) {
		/*
		 * MyThread threadOne = new MyThread(); threadOne.setName("Thread One");
		 * MyThread threadTwo = new MyThread(); threadTwo.setName("Thread Two");
		 * MyThread threadThree = new MyThread(); threadThree.setName("Thread Three");
		 * MyThread threadFour = new MyThread(); threadFour.setName("Thread Four");
		 * MyThread threadFive = new MyThread(); threadFive.setName("Thread Five");
		 * MyThread threadSix = new MyThread(); threadSix.setName("Thread Six");
		 * 
		 * 
		 * threadOne.start(); threadTwo.start(); threadThree.start();
		 * threadFour.start(); threadFive.start(); threadSix.start();
		 */

		ExecutorService executor = Executors.newFixedThreadPool(6);
		for (int i = 0; i < 10; i++) {
			executor.execute(new MyThread());
		}
		executor.shutdown();
	}
}

class MyThread extends Thread {
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started");
		double count = 0;
		long startTime = System.currentTimeMillis();
		double randomNumber = (Math.ceil(Math.random() * 10000));
		while (count < 1000000000) {
			count++;
		}
		count += randomNumber;
		long stopTime = System.currentTimeMillis();
		System.out.println(name + " finished execution in " + (stopTime - startTime) + ", result is " + count);
	}
}
