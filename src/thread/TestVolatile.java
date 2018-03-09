package thread;

class MyThreadVolatile extends Thread {

	int count = 0;

	public void run() {
		while (TestVolatile.keepRunning) {
			count++;
		}
		System.out.println("Thread terminated." + count);
	}
}

class MyThreadVolatileTwo extends Thread {
	static boolean keepRunning = true;
	int count = 0;

	public void run() {
		System.out.println("Thread 2 setting keepRunning to false.");
		TestVolatile.keepRunning = false;
	}
}

public class TestVolatile {
	static boolean keepRunning = true;

	public static void main(String[] args) throws InterruptedException {
		MyThreadVolatile t = new MyThreadVolatile();
		t.start();
		Thread.sleep(50);
		MyThreadVolatileTwo t2 = new MyThreadVolatileTwo();
		t2.start();
	}
}