package ASAP.Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyThread1 {
	public static void main(String args[]) {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		Runnable task1 = () -> {
			System.out.println("Executing Task1 inside : " + Thread.currentThread().getName());
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException ex) {
				throw new IllegalStateException(ex);
			}
		};

		Runnable task2 = () -> {
			System.out.println("Executing Task2 inside : " + Thread.currentThread().getName());
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException ex) {
				throw new IllegalStateException(ex);
			}
		};
		Callable<String> task3 = () -> {
			System.out.println("Executing Task3 inside : " + Thread.currentThread().getName());
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException ex) {
				throw new IllegalStateException(ex);
			}
			return "Executed callable bro...";
		};

		executor.execute(task1);
		executor.execute(task2);
		Object str = executor.submit(task3);
		System.out.println(str);
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		System.out.println("Finished all threads");
	}

}
