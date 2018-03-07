package thread;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMap {
	static Map<Integer, Double> map = new HashMap<>();
	static Map<Integer, Double> myMap= Collections.synchronizedMap(map);

	public static void main(String[] args) throws InterruptedException {
		
		ThreadMapOne t1 = new ThreadMapOne();
		ThreadMapTwo t2 = new ThreadMapTwo();
		ThreadMapOne t3 = new ThreadMapOne();
		t1.start();
		t3.start();
		t2.start();
		
		Thread.sleep(1000);
		System.out.println(myMap.size());
	}
}

class ThreadMapOne extends Thread {
	public void run() {
		int count = 0;
		while (count < 10) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			double number = Math.floor(Math.random() * 1000);
			System.out.println(Thread.currentThread().getName() +" writing at index " + count + " value " + number);
			SynchronizedMap.myMap.put(count, number);
			count++;
		}
	}
}

class ThreadMapTwo extends Thread {
	public void run() {
		int count = 0;
		while (count < 10) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() +" removing at index " + count);
			SynchronizedMap.myMap.remove(count);
			count++;
		}
	}
}
