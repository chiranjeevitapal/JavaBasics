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

public class TestVolatile {
	static volatile boolean keepRunning = true;

	public static void main(String[] args) throws InterruptedException {
		MyThreadVolatile t = new MyThreadVolatile();
		t.start();
		Thread.sleep(1000);
		MyThreadVolatileTwo t2 = new MyThreadVolatileTwo();
		t2.start();
	}
}

class MyThreadVolatileTwo extends Thread {
	static boolean keepRunning = true;
	int count = 0;

	public void run() {
		TestVolatile.keepRunning = false;
		System.out.println("keepRunning set to false.");
	}
}