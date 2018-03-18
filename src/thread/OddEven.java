package thread;

public class OddEven {
	static Object lock = new Object();
	public static final int MAX = 9;

	public static void main(String[] args) throws InterruptedException {
		OddThread oddThread = new OddThread();
		EvenThread evenThread = new EvenThread();

		oddThread.start();
		// Thread.sleep(2000);
		evenThread.start();
		oddThread.join();
		evenThread.join();
	}

}

class OddThread extends Thread {
	int number = 1;

	public void run() {
		while (number <= OddEven.MAX) {
			synchronized (OddEven.lock) {
				System.out.println("Odd thread printing: " + number);
				try {
					System.out.println("Odd thread going to wait.");
					number += 2;
					System.out.println("Even Thread Notified.");
					Thread.sleep(1000);
					OddEven.lock.notify();
					OddEven.lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		 System.out.println("Stopped Running....");
	}
}

class EvenThread extends Thread {

	int number = 2;

	public void run() {
		while (number <= OddEven.MAX) {
			synchronized (OddEven.lock) {
				System.out.println("Even thread printing: " + number);
				try {
					System.out.println("Even thread going to wait.");
					number += 2;
					System.out.println("Odd Thread Notified.");
					Thread.sleep(1000);
					OddEven.lock.notify();
					OddEven.lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		 System.out.println("Stopped Running....");
	}
}
